package ru.countrystuff.model;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

/**
 * Created by RAMSES on 29.03.2016.
 */
public class ItemCategory extends AbstractNamedEntity {
    protected ItemCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public static ItemCategory createExisting(Integer id, String name) {
        Preconditions.checkArgument(id != null);
        Preconditions.checkArgument(!Strings.isNullOrEmpty(name));
        return new ItemCategory(id, name);
    }

    @Override
    public String toString() {
        return "ItemCategory{" +
                "id=" + id +
                ", name=" + name + "} ";
    }
}
