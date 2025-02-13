// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/** The SQLServerDataFeed model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataSourceType")
@JsonTypeName("SqlServer")
@Fluent
public final class SQLServerDataFeed extends DataFeedDetail {
    /*
     * The dataSourceParameter property.
     */
    @JsonProperty(value = "dataSourceParameter", required = true)
    private SqlSourceParameter dataSourceParameter;

    /** Creates an instance of SQLServerDataFeed class. */
    public SQLServerDataFeed() {}

    /**
     * Get the dataSourceParameter property: The dataSourceParameter property.
     *
     * @return the dataSourceParameter value.
     */
    public SqlSourceParameter getDataSourceParameter() {
        return this.dataSourceParameter;
    }

    /**
     * Set the dataSourceParameter property: The dataSourceParameter property.
     *
     * @param dataSourceParameter the dataSourceParameter value to set.
     * @return the SQLServerDataFeed object itself.
     */
    public SQLServerDataFeed setDataSourceParameter(SqlSourceParameter dataSourceParameter) {
        this.dataSourceParameter = dataSourceParameter;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setDataFeedName(String dataFeedName) {
        super.setDataFeedName(dataFeedName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setDataFeedDescription(String dataFeedDescription) {
        super.setDataFeedDescription(dataFeedDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setGranularityName(Granularity granularityName) {
        super.setGranularityName(granularityName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setGranularityAmount(Integer granularityAmount) {
        super.setGranularityAmount(granularityAmount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setMetrics(List<DataFeedMetric> metrics) {
        super.setMetrics(metrics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setDimension(List<DataFeedDimension> dimension) {
        super.setDimension(dimension);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setTimestampColumn(String timestampColumn) {
        super.setTimestampColumn(timestampColumn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setDataStartFrom(OffsetDateTime dataStartFrom) {
        super.setDataStartFrom(dataStartFrom);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setStartOffsetInSeconds(Long startOffsetInSeconds) {
        super.setStartOffsetInSeconds(startOffsetInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setMaxConcurrency(Integer maxConcurrency) {
        super.setMaxConcurrency(maxConcurrency);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setMinRetryIntervalInSeconds(Long minRetryIntervalInSeconds) {
        super.setMinRetryIntervalInSeconds(minRetryIntervalInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setStopRetryAfterInSeconds(Long stopRetryAfterInSeconds) {
        super.setStopRetryAfterInSeconds(stopRetryAfterInSeconds);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setNeedRollup(NeedRollupEnum needRollup) {
        super.setNeedRollup(needRollup);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setRollUpMethod(RollUpMethod rollUpMethod) {
        super.setRollUpMethod(rollUpMethod);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setRollUpColumns(List<String> rollUpColumns) {
        super.setRollUpColumns(rollUpColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setAllUpIdentification(String allUpIdentification) {
        super.setAllUpIdentification(allUpIdentification);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setFillMissingPointType(FillMissingPointType fillMissingPointType) {
        super.setFillMissingPointType(fillMissingPointType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setFillMissingPointValue(Double fillMissingPointValue) {
        super.setFillMissingPointValue(fillMissingPointValue);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setViewMode(ViewMode viewMode) {
        super.setViewMode(viewMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setAdmins(List<String> admins) {
        super.setAdmins(admins);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setViewers(List<String> viewers) {
        super.setViewers(viewers);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setActionLinkTemplate(String actionLinkTemplate) {
        super.setActionLinkTemplate(actionLinkTemplate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        super.setAuthenticationType(authenticationType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SQLServerDataFeed setCredentialId(String credentialId) {
        super.setCredentialId(credentialId);
        return this;
    }
}
