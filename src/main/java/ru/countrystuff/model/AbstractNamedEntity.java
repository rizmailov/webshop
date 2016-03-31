package ru.countrystuff.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Created by RAMSES on 29.03.2016.
 */
public abstract class AbstractNamedEntity extends AbstractEntity {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .toString();
    }
}
