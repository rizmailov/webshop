package ru.countrystuff.repository;

import com.google.common.collect.Sets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.countrystuff.model.Item;
import ru.countrystuff.service.CatalogueService;
import ru.countrystuff.util.TestsUtils;

import java.util.Set;

import static ru.countrystuff.TestsData.*;

/**
 * Created by RAMSES on 29.03.2016.
 */
@ContextConfiguration({"classpath:spring/spring-app.xml", "classpath:spring/spring-db.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Sql("classpath:db/populateDB.sql")
public class ItemServiceTest {

    @Autowired
    CatalogueService service;

    @Test
    public void getAll() {
        Set<Item> allItems = Sets.newHashSet(service.getAllItems());
        TestsUtils.assertEquals(Sets.newHashSet(ITEM1, ITEM2), allItems);
    }
}
