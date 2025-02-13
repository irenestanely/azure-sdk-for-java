// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The cluster tier. */
public final class Tier extends ExpandableStringEnum<Tier> {
    /** Static value Standard for Tier. */
    public static final Tier STANDARD = fromString("Standard");

    /** Static value Premium for Tier. */
    public static final Tier PREMIUM = fromString("Premium");

    /**
     * Creates or finds a Tier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Tier.
     */
    @JsonCreator
    public static Tier fromString(String name) {
        return fromString(name, Tier.class);
    }

    /**
     * Gets known Tier values.
     *
     * @return known Tier values.
     */
    public static Collection<Tier> values() {
        return values(Tier.class);
    }
}
