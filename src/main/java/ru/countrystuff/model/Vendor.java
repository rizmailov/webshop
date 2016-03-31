package ru.countrystuff.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 * Created by RAMSES on 29.03.2016.
 */
public class Vendor extends AbstractNamedEntity {
    private Country country;

    protected Vendor(Integer id, String name, Country country) {
        Preconditions.checkArgument(id != null);
        Preconditions.checkArgument(!Strings.isNullOrEmpty(name));
        Preconditions.checkArgument(country != null);

        this.id = id;
        this.name = name;
        this.country = country;
    }

    public static Vendor createExisting(Integer id, String name, Country country) {
        return new Vendor(id, name, country);
    }

    @Override
    public String toString() {
        return "Vendor{" +
                "id=" + id +
                ", name=" + name +
                ", countryName='" + country + '\'' +
                "} ";
    }
}
