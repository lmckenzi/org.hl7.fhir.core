package org.hl7.fhir.convertors.advisors.impl;

import org.hl7.fhir.convertors.advisors.interfaces.BaseAdvisor50;
import org.hl7.fhir.r5.model.CodeSystem;
import org.hl7.fhir.r5.model.ValueSet;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class BaseAdvisor_40_50 extends BaseAdvisor50<org.hl7.fhir.r4.model.Extension> {

  private final List<CodeSystem> cslist = new ArrayList<>();

  public BaseAdvisor_40_50() {}

  public BaseAdvisor_40_50(Boolean failFast) {
    this.failFast = failFast;
  }

  public final List<CodeSystem> getCslist() {
    return this.cslist;
  }

  public void handleCodeSystem(@NotNull CodeSystem tgtcs, @NotNull ValueSet source) {
    tgtcs.setId(source.getId());
    tgtcs.setValueSet(source.getUrl());
    this.cslist.add(tgtcs);
  }
}
