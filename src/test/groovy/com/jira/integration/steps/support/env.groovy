package com.jira.integration.steps.support

import cucumber.api.groovy.Hooks
import cucumber.runtime.ScenarioImpl

this.metaClass.mixin(Hooks)

Before() { ScenarioImpl scenario ->

    println(scenario.getName())

}

After() { ScenarioImpl scenario ->

    println(scenario.getSourceTagNames())


}