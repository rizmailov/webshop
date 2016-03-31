package ru.countrystuff.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 * Created by RAMSES on 29.03.2016.
 */
public class Country extends AbstractNamedEntity {
    protected Country(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Country createExisting(Integer id, String name) {
        Preconditions.checkArgument(id != null);
        Preconditions.checkArgument(!Strings.isNullOrEmpty(name));

        return new Country(id, name);
    }
}
