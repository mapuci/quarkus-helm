package io.quarkiverse.helm.deployment;

import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigGroup;
import io.quarkus.runtime.annotations.ConfigItem;

@ConfigGroup
public class AddIfStatementConfig {

    /**
     * The property to use in the if statement.
     */
    @ConfigItem
    Optional<String> property;

    /**
     * The resource kind where to include the if statement.
     */
    @ConfigItem
    Optional<String> onResourceKind;

    /**
     * The resource kind where to include the if statement.
     */
    @ConfigItem
    Optional<String> onResourceName;

    /**
     * The default value of the property
     */
    @ConfigItem(defaultValue = "true")
    boolean withDefaultValue;
}
