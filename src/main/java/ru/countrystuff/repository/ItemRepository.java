package ru.countrystuff.repository;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;
import ru.countrystuff.model.Country;
import ru.countrystuff.model.Item;
import ru.countrystuff.model.ItemCategory;
import ru.countrystuff.model.Vendor;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by RAMSES on 29.03.2016.
 */
@Repository
public class ItemRepository {

    private static final ResultSetExtractor<List<Item>> RESULT_SET_EXTRACTOR = new ResultSetExtractor<List<Item>>() {
        public List<Item> extractData(ResultSet rs) throws SQLException, DataAccessException {
            List<Item> result = Lists.newArrayList();
            while (rs.next()) {
                Item item = Item.createExisting(
                        rs.getInt("id"),
                        rs.getString("name"),
                        Vendor.createExisting(rs.getInt("vendor_id"), rs.getString("vendor_name"), Country.createExisting(rs.getInt("country_id"), rs.getString("country_name"))),
                        ItemCategory.createExisting(rs.getInt("item_category_id"), rs.getString("item_category_name")),
                        rs.getString("description"),
                        rs.getString("image"),
                        rs.getDouble("price")
                );
                result.add(item);

            }
            return result;
        }
    };

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    NamedParameterJdbcTemplate namedJdbcTemplate;

    SimpleJdbcInsert itemInsert;

    @Autowired
    public ItemRepository(DataSource dataSource) {
        itemInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("item")
                .usingGeneratedKeyColumns("id");

    }

    public List<Item> getAll() {
        try {
            Class.forName("com.mysql.fabric.jdbc.FabricMySQLDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return jdbcTemplate.query(
                "SELECT i.id, " +
                        "i.name, " +
                        "v.id AS vendor_id, " +
                        "v.name AS vendor_name, " +
                        "c.id AS country_id, " +
                        "c.name AS country_name, " +
                        "ic.id AS item_category_id, " +
                        "ic.name AS item_category_name, " +
                        "i.description, " +
                        "i.image, " +
                        "i.price " +
                        "FROM item i " +
                        "LEFT JOIN vendor v ON v.id = i.vendor_id " +
                        "LEFT JOIN country c ON c.id = v.country_id " +
                        "LEFT JOIN item_category ic ON ic.id = i.item_category_id", RESULT_SET_EXTRACTOR);
    }
}
