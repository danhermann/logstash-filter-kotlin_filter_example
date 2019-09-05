package org.logstashplugins

import co.elastic.logstash.api.Configuration
import co.elastic.logstash.api.Context
import co.elastic.logstash.api.Event
import co.elastic.logstash.api.Filter
import co.elastic.logstash.api.FilterMatchListener
import co.elastic.logstash.api.LogstashPlugin
import co.elastic.logstash.api.PluginConfigSpec
import co.elastic.logstash.api.PluginHelper

@LogstashPlugin(name = "kfilter")
class kfilter(id: String, config: Configuration, context: Context) : Filter {

    private val filterId: String = id

    override fun getId(): String {
        return filterId
    }

    override fun filter(p0: MutableCollection<Event>?, p1: FilterMatchListener?): MutableCollection<Event>? {
        return p0;
    }

    override fun configSchema(): MutableCollection<PluginConfigSpec<*>> {
        return PluginHelper.commonFilterSettings();
    }
}
