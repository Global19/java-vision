/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1p3beta1/product_search_service.proto

package com.google.cloud.vision.v1p3beta1;

public interface ImportProductSetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p3beta1.ImportProductSetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of reference_images that are imported successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1p3beta1.ReferenceImage> getReferenceImagesList();
  /**
   *
   *
   * <pre>
   * The list of reference_images that are imported successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.ReferenceImage getReferenceImages(int index);
  /**
   *
   *
   * <pre>
   * The list of reference_images that are imported successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  int getReferenceImagesCount();
  /**
   *
   *
   * <pre>
   * The list of reference_images that are imported successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder>
      getReferenceImagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of reference_images that are imported successfully.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p3beta1.ReferenceImage reference_images = 1;</code>
   */
  com.google.cloud.vision.v1p3beta1.ReferenceImageOrBuilder getReferenceImagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The rpc status for each ImportProductSet request, including both successes
   * and errors.
   * The number of statuses here matches the number of lines in the csv file,
   * and statuses[i] stores the success or failure status of processing the i-th
   * line of the csv, starting from line 0.
   * </pre>
   *
   * <code>repeated .google.rpc.Status statuses = 2;</code>
   */
  java.util.List<com.google.rpc.Status> getStatusesList();
  /**
   *
   *
   * <pre>
   * The rpc status for each ImportProductSet request, including both successes
   * and errors.
   * The number of statuses here matches the number of lines in the csv file,
   * and statuses[i] stores the success or failure status of processing the i-th
   * line of the csv, starting from line 0.
   * </pre>
   *
   * <code>repeated .google.rpc.Status statuses = 2;</code>
   */
  com.google.rpc.Status getStatuses(int index);
  /**
   *
   *
   * <pre>
   * The rpc status for each ImportProductSet request, including both successes
   * and errors.
   * The number of statuses here matches the number of lines in the csv file,
   * and statuses[i] stores the success or failure status of processing the i-th
   * line of the csv, starting from line 0.
   * </pre>
   *
   * <code>repeated .google.rpc.Status statuses = 2;</code>
   */
  int getStatusesCount();
  /**
   *
   *
   * <pre>
   * The rpc status for each ImportProductSet request, including both successes
   * and errors.
   * The number of statuses here matches the number of lines in the csv file,
   * and statuses[i] stores the success or failure status of processing the i-th
   * line of the csv, starting from line 0.
   * </pre>
   *
   * <code>repeated .google.rpc.Status statuses = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getStatusesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The rpc status for each ImportProductSet request, including both successes
   * and errors.
   * The number of statuses here matches the number of lines in the csv file,
   * and statuses[i] stores the success or failure status of processing the i-th
   * line of the csv, starting from line 0.
   * </pre>
   *
   * <code>repeated .google.rpc.Status statuses = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusesOrBuilder(int index);
}
