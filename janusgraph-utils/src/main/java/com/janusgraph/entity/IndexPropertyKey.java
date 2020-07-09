package com.janusgraph.entity;

import java.io.Serializable;

import com.janusgraph.enums.DataType;
import com.janusgraph.enums.Mapping;

/**
 * schema中IndexPropertyKey实体信息.
 *
 */
public class IndexPropertyKey implements Serializable {

  private static final long serialVersionUID = 8944255584746876120L;

  private String name;

  private DataType type;

  private Mapping mapping;

  private String description;

  public IndexPropertyKey() {}

  public IndexPropertyKey(String name) {
    this.name = name;
  }

  public IndexPropertyKey(String name, DataType type) {
    this.name = name;
    this.type = type;
  }

  public IndexPropertyKey(String name, Mapping mapping) {
    this.name = name;
    this.mapping = mapping;
  }

  public IndexPropertyKey(String name, DataType type, Mapping mapping) {
    this.name = name;
    this.type = type;
    this.mapping = mapping;
  }

  public IndexPropertyKey(String name, DataType type, Mapping mapping, String description) {
    this.name = name;
    this.type = type;
    this.mapping = mapping;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DataType getType() {
    return type;
  }

  public void setType(DataType type) {
    this.type = type;
  }

  public Mapping getMapping() {
    return mapping;
  }

  public void setMapping(Mapping mapping) {
    this.mapping = mapping;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
