/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.discovery.v1.model;

import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;
import com.ibm.cloud.sdk.core.util.GsonSerializationHelper;

/**
 * QueryNoticesResult.
 */
public class QueryNoticesResult extends DynamicModel {
  /**
   * The type of the original source file.
   */
  public interface FileType {
    /** pdf. */
    String PDF = "pdf";
    /** html. */
    String HTML = "html";
    /** word. */
    String WORD = "word";
    /** json. */
    String JSON = "json";
  }

  private java.lang.reflect.Type idType = new TypeToken<String>() {
  }.getType();
  private java.lang.reflect.Type metadataType = new TypeToken<Map<String, Object>>() {
  }.getType();
  private java.lang.reflect.Type collectionIdType = new TypeToken<String>() {
  }.getType();
  private java.lang.reflect.Type resultMetadataType = new TypeToken<QueryResultMetadata>() {
  }.getType();
  private java.lang.reflect.Type titleType = new TypeToken<String>() {
  }.getType();
  private java.lang.reflect.Type codeType = new TypeToken<Long>() {
  }.getType();
  private java.lang.reflect.Type filenameType = new TypeToken<String>() {
  }.getType();
  private java.lang.reflect.Type fileTypeType = new TypeToken<String>() {
  }.getType();
  private java.lang.reflect.Type sha1Type = new TypeToken<String>() {
  }.getType();
  private java.lang.reflect.Type noticesType = new TypeToken<List<Notice>>() {
  }.getType();

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("id"), idType);
  }

  /**
   * Gets the metadata.
   *
   * @return the metadata
   */
  public Map<String, Object> getMetadata() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("metadata"), metadataType);
  }

  /**
   * Gets the collectionId.
   *
   * @return the collectionId
   */
  public String getCollectionId() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("collection_id"), collectionIdType);
  }

  /**
   * Gets the resultMetadata.
   *
   * @return the resultMetadata
   */
  public QueryResultMetadata getResultMetadata() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("result_metadata"), resultMetadataType);
  }

  /**
   * Gets the title.
   *
   * @return the title
   */
  public String getTitle() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("title"), titleType);
  }

  /**
   * Gets the code.
   *
   * @return the code
   */
  public Long getCode() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("code"), codeType);
  }

  /**
   * Gets the filename.
   *
   * @return the filename
   */
  public String getFilename() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("filename"), filenameType);
  }

  /**
   * Gets the fileType.
   *
   * @return the fileType
   */
  public String getFileType() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("file_type"), fileTypeType);
  }

  /**
   * Gets the sha1.
   *
   * @return the sha1
   */
  public String getSha1() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("sha1"), sha1Type);
  }

  /**
   * Gets the notices.
   *
   * @return the notices
   */
  public List<Notice> getNotices() {
    return GsonSerializationHelper.serializeDynamicModelProperty(this.get("notices"), noticesType);
  }
}
