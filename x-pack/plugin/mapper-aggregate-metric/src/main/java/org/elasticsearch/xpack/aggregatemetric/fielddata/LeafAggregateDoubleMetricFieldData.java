/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License;
 * you may not use this file except in compliance with the Elastic License.
 */
package org.elasticsearch.xpack.aggregatemetric.fielddata;

import org.elasticsearch.index.fielddata.LeafFieldData;
import org.elasticsearch.index.fielddata.SortedNumericDoubleValues;
import org.elasticsearch.xpack.aggregatemetric.mapper.AggregateDoubleMetricFieldMapper.Metric;

import java.io.IOException;

/**
 * {@link LeafFieldData} specialization for aggregate_double_metric data.
 */
public interface LeafAggregateDoubleMetricFieldData extends LeafFieldData {

    /**
     * Return aggregate_metric of double values for a given metric
     */
    SortedNumericDoubleValues getAggregateMetricValues(Metric metric) throws IOException;

}
