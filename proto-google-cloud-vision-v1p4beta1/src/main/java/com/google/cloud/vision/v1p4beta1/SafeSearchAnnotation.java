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
// source: google/cloud/vision/v1p4beta1/image_annotator.proto

package com.google.cloud.vision.v1p4beta1;

/**
 *
 *
 * <pre>
 * Set of features pertaining to the image, computed by computer vision
 * methods over safe-search verticals (for example, adult, spoof, medical,
 * violence).
 * </pre>
 *
 * Protobuf type {@code google.cloud.vision.v1p4beta1.SafeSearchAnnotation}
 */
public final class SafeSearchAnnotation extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vision.v1p4beta1.SafeSearchAnnotation)
    SafeSearchAnnotationOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SafeSearchAnnotation.newBuilder() to construct.
  private SafeSearchAnnotation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SafeSearchAnnotation() {
    adult_ = 0;
    spoof_ = 0;
    medical_ = 0;
    violence_ = 0;
    racy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SafeSearchAnnotation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SafeSearchAnnotation(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              adult_ = rawValue;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              spoof_ = rawValue;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              medical_ = rawValue;
              break;
            }
          case 32:
            {
              int rawValue = input.readEnum();

              violence_ = rawValue;
              break;
            }
          case 72:
            {
              int rawValue = input.readEnum();

              racy_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_SafeSearchAnnotation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
        .internal_static_google_cloud_vision_v1p4beta1_SafeSearchAnnotation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.class,
            com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.Builder.class);
  }

  public static final int ADULT_FIELD_NUMBER = 1;
  private int adult_;
  /**
   *
   *
   * <pre>
   * Represents the adult content likelihood for the image. Adult content may
   * contain elements such as nudity, pornographic images or cartoons, or
   * sexual activities.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
   *
   * @return The enum numeric value on the wire for adult.
   */
  public int getAdultValue() {
    return adult_;
  }
  /**
   *
   *
   * <pre>
   * Represents the adult content likelihood for the image. Adult content may
   * contain elements such as nudity, pornographic images or cartoons, or
   * sexual activities.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
   *
   * @return The adult.
   */
  public com.google.cloud.vision.v1p4beta1.Likelihood getAdult() {
    @SuppressWarnings("deprecation")
    com.google.cloud.vision.v1p4beta1.Likelihood result =
        com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(adult_);
    return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
  }

  public static final int SPOOF_FIELD_NUMBER = 2;
  private int spoof_;
  /**
   *
   *
   * <pre>
   * Spoof likelihood. The likelihood that an modification
   * was made to the image's canonical version to make it appear
   * funny or offensive.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
   *
   * @return The enum numeric value on the wire for spoof.
   */
  public int getSpoofValue() {
    return spoof_;
  }
  /**
   *
   *
   * <pre>
   * Spoof likelihood. The likelihood that an modification
   * was made to the image's canonical version to make it appear
   * funny or offensive.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
   *
   * @return The spoof.
   */
  public com.google.cloud.vision.v1p4beta1.Likelihood getSpoof() {
    @SuppressWarnings("deprecation")
    com.google.cloud.vision.v1p4beta1.Likelihood result =
        com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(spoof_);
    return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
  }

  public static final int MEDICAL_FIELD_NUMBER = 3;
  private int medical_;
  /**
   *
   *
   * <pre>
   * Likelihood that this is a medical image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
   *
   * @return The enum numeric value on the wire for medical.
   */
  public int getMedicalValue() {
    return medical_;
  }
  /**
   *
   *
   * <pre>
   * Likelihood that this is a medical image.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
   *
   * @return The medical.
   */
  public com.google.cloud.vision.v1p4beta1.Likelihood getMedical() {
    @SuppressWarnings("deprecation")
    com.google.cloud.vision.v1p4beta1.Likelihood result =
        com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(medical_);
    return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
  }

  public static final int VIOLENCE_FIELD_NUMBER = 4;
  private int violence_;
  /**
   *
   *
   * <pre>
   * Likelihood that this image contains violent content.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
   *
   * @return The enum numeric value on the wire for violence.
   */
  public int getViolenceValue() {
    return violence_;
  }
  /**
   *
   *
   * <pre>
   * Likelihood that this image contains violent content.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
   *
   * @return The violence.
   */
  public com.google.cloud.vision.v1p4beta1.Likelihood getViolence() {
    @SuppressWarnings("deprecation")
    com.google.cloud.vision.v1p4beta1.Likelihood result =
        com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(violence_);
    return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
  }

  public static final int RACY_FIELD_NUMBER = 9;
  private int racy_;
  /**
   *
   *
   * <pre>
   * Likelihood that the request image contains racy content. Racy content may
   * include (but is not limited to) skimpy or sheer clothing, strategically
   * covered nudity, lewd or provocative poses, or close-ups of sensitive
   * body areas.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
   *
   * @return The enum numeric value on the wire for racy.
   */
  public int getRacyValue() {
    return racy_;
  }
  /**
   *
   *
   * <pre>
   * Likelihood that the request image contains racy content. Racy content may
   * include (but is not limited to) skimpy or sheer clothing, strategically
   * covered nudity, lewd or provocative poses, or close-ups of sensitive
   * body areas.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
   *
   * @return The racy.
   */
  public com.google.cloud.vision.v1p4beta1.Likelihood getRacy() {
    @SuppressWarnings("deprecation")
    com.google.cloud.vision.v1p4beta1.Likelihood result =
        com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(racy_);
    return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (adult_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      output.writeEnum(1, adult_);
    }
    if (spoof_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      output.writeEnum(2, spoof_);
    }
    if (medical_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      output.writeEnum(3, medical_);
    }
    if (violence_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      output.writeEnum(4, violence_);
    }
    if (racy_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      output.writeEnum(9, racy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adult_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, adult_);
    }
    if (spoof_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, spoof_);
    }
    if (medical_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, medical_);
    }
    if (violence_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, violence_);
    }
    if (racy_ != com.google.cloud.vision.v1p4beta1.Likelihood.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(9, racy_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation)) {
      return super.equals(obj);
    }
    com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation other =
        (com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation) obj;

    if (adult_ != other.adult_) return false;
    if (spoof_ != other.spoof_) return false;
    if (medical_ != other.medical_) return false;
    if (violence_ != other.violence_) return false;
    if (racy_ != other.racy_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ADULT_FIELD_NUMBER;
    hash = (53 * hash) + adult_;
    hash = (37 * hash) + SPOOF_FIELD_NUMBER;
    hash = (53 * hash) + spoof_;
    hash = (37 * hash) + MEDICAL_FIELD_NUMBER;
    hash = (53 * hash) + medical_;
    hash = (37 * hash) + VIOLENCE_FIELD_NUMBER;
    hash = (53 * hash) + violence_;
    hash = (37 * hash) + RACY_FIELD_NUMBER;
    hash = (53 * hash) + racy_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Set of features pertaining to the image, computed by computer vision
   * methods over safe-search verticals (for example, adult, spoof, medical,
   * violence).
   * </pre>
   *
   * Protobuf type {@code google.cloud.vision.v1p4beta1.SafeSearchAnnotation}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vision.v1p4beta1.SafeSearchAnnotation)
      com.google.cloud.vision.v1p4beta1.SafeSearchAnnotationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_SafeSearchAnnotation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_SafeSearchAnnotation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.class,
              com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.Builder.class);
    }

    // Construct using com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      adult_ = 0;

      spoof_ = 0;

      medical_ = 0;

      violence_ = 0;

      racy_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vision.v1p4beta1.ImageAnnotatorProto
          .internal_static_google_cloud_vision_v1p4beta1_SafeSearchAnnotation_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation getDefaultInstanceForType() {
      return com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation build() {
      com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation buildPartial() {
      com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation result =
          new com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation(this);
      result.adult_ = adult_;
      result.spoof_ = spoof_;
      result.medical_ = medical_;
      result.violence_ = violence_;
      result.racy_ = racy_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation) {
        return mergeFrom((com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation other) {
      if (other == com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation.getDefaultInstance())
        return this;
      if (other.adult_ != 0) {
        setAdultValue(other.getAdultValue());
      }
      if (other.spoof_ != 0) {
        setSpoofValue(other.getSpoofValue());
      }
      if (other.medical_ != 0) {
        setMedicalValue(other.getMedicalValue());
      }
      if (other.violence_ != 0) {
        setViolenceValue(other.getViolenceValue());
      }
      if (other.racy_ != 0) {
        setRacyValue(other.getRacyValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int adult_ = 0;
    /**
     *
     *
     * <pre>
     * Represents the adult content likelihood for the image. Adult content may
     * contain elements such as nudity, pornographic images or cartoons, or
     * sexual activities.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
     *
     * @return The enum numeric value on the wire for adult.
     */
    public int getAdultValue() {
      return adult_;
    }
    /**
     *
     *
     * <pre>
     * Represents the adult content likelihood for the image. Adult content may
     * contain elements such as nudity, pornographic images or cartoons, or
     * sexual activities.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
     *
     * @param value The enum numeric value on the wire for adult to set.
     * @return This builder for chaining.
     */
    public Builder setAdultValue(int value) {
      adult_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the adult content likelihood for the image. Adult content may
     * contain elements such as nudity, pornographic images or cartoons, or
     * sexual activities.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
     *
     * @return The adult.
     */
    public com.google.cloud.vision.v1p4beta1.Likelihood getAdult() {
      @SuppressWarnings("deprecation")
      com.google.cloud.vision.v1p4beta1.Likelihood result =
          com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(adult_);
      return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Represents the adult content likelihood for the image. Adult content may
     * contain elements such as nudity, pornographic images or cartoons, or
     * sexual activities.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
     *
     * @param value The adult to set.
     * @return This builder for chaining.
     */
    public Builder setAdult(com.google.cloud.vision.v1p4beta1.Likelihood value) {
      if (value == null) {
        throw new NullPointerException();
      }

      adult_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Represents the adult content likelihood for the image. Adult content may
     * contain elements such as nudity, pornographic images or cartoons, or
     * sexual activities.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood adult = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAdult() {

      adult_ = 0;
      onChanged();
      return this;
    }

    private int spoof_ = 0;
    /**
     *
     *
     * <pre>
     * Spoof likelihood. The likelihood that an modification
     * was made to the image's canonical version to make it appear
     * funny or offensive.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
     *
     * @return The enum numeric value on the wire for spoof.
     */
    public int getSpoofValue() {
      return spoof_;
    }
    /**
     *
     *
     * <pre>
     * Spoof likelihood. The likelihood that an modification
     * was made to the image's canonical version to make it appear
     * funny or offensive.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
     *
     * @param value The enum numeric value on the wire for spoof to set.
     * @return This builder for chaining.
     */
    public Builder setSpoofValue(int value) {
      spoof_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Spoof likelihood. The likelihood that an modification
     * was made to the image's canonical version to make it appear
     * funny or offensive.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
     *
     * @return The spoof.
     */
    public com.google.cloud.vision.v1p4beta1.Likelihood getSpoof() {
      @SuppressWarnings("deprecation")
      com.google.cloud.vision.v1p4beta1.Likelihood result =
          com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(spoof_);
      return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Spoof likelihood. The likelihood that an modification
     * was made to the image's canonical version to make it appear
     * funny or offensive.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
     *
     * @param value The spoof to set.
     * @return This builder for chaining.
     */
    public Builder setSpoof(com.google.cloud.vision.v1p4beta1.Likelihood value) {
      if (value == null) {
        throw new NullPointerException();
      }

      spoof_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Spoof likelihood. The likelihood that an modification
     * was made to the image's canonical version to make it appear
     * funny or offensive.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood spoof = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSpoof() {

      spoof_ = 0;
      onChanged();
      return this;
    }

    private int medical_ = 0;
    /**
     *
     *
     * <pre>
     * Likelihood that this is a medical image.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
     *
     * @return The enum numeric value on the wire for medical.
     */
    public int getMedicalValue() {
      return medical_;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this is a medical image.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
     *
     * @param value The enum numeric value on the wire for medical to set.
     * @return This builder for chaining.
     */
    public Builder setMedicalValue(int value) {
      medical_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this is a medical image.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
     *
     * @return The medical.
     */
    public com.google.cloud.vision.v1p4beta1.Likelihood getMedical() {
      @SuppressWarnings("deprecation")
      com.google.cloud.vision.v1p4beta1.Likelihood result =
          com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(medical_);
      return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this is a medical image.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
     *
     * @param value The medical to set.
     * @return This builder for chaining.
     */
    public Builder setMedical(com.google.cloud.vision.v1p4beta1.Likelihood value) {
      if (value == null) {
        throw new NullPointerException();
      }

      medical_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this is a medical image.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood medical = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMedical() {

      medical_ = 0;
      onChanged();
      return this;
    }

    private int violence_ = 0;
    /**
     *
     *
     * <pre>
     * Likelihood that this image contains violent content.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
     *
     * @return The enum numeric value on the wire for violence.
     */
    public int getViolenceValue() {
      return violence_;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this image contains violent content.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
     *
     * @param value The enum numeric value on the wire for violence to set.
     * @return This builder for chaining.
     */
    public Builder setViolenceValue(int value) {
      violence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this image contains violent content.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
     *
     * @return The violence.
     */
    public com.google.cloud.vision.v1p4beta1.Likelihood getViolence() {
      @SuppressWarnings("deprecation")
      com.google.cloud.vision.v1p4beta1.Likelihood result =
          com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(violence_);
      return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this image contains violent content.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
     *
     * @param value The violence to set.
     * @return This builder for chaining.
     */
    public Builder setViolence(com.google.cloud.vision.v1p4beta1.Likelihood value) {
      if (value == null) {
        throw new NullPointerException();
      }

      violence_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that this image contains violent content.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood violence = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearViolence() {

      violence_ = 0;
      onChanged();
      return this;
    }

    private int racy_ = 0;
    /**
     *
     *
     * <pre>
     * Likelihood that the request image contains racy content. Racy content may
     * include (but is not limited to) skimpy or sheer clothing, strategically
     * covered nudity, lewd or provocative poses, or close-ups of sensitive
     * body areas.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
     *
     * @return The enum numeric value on the wire for racy.
     */
    public int getRacyValue() {
      return racy_;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that the request image contains racy content. Racy content may
     * include (but is not limited to) skimpy or sheer clothing, strategically
     * covered nudity, lewd or provocative poses, or close-ups of sensitive
     * body areas.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
     *
     * @param value The enum numeric value on the wire for racy to set.
     * @return This builder for chaining.
     */
    public Builder setRacyValue(int value) {
      racy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that the request image contains racy content. Racy content may
     * include (but is not limited to) skimpy or sheer clothing, strategically
     * covered nudity, lewd or provocative poses, or close-ups of sensitive
     * body areas.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
     *
     * @return The racy.
     */
    public com.google.cloud.vision.v1p4beta1.Likelihood getRacy() {
      @SuppressWarnings("deprecation")
      com.google.cloud.vision.v1p4beta1.Likelihood result =
          com.google.cloud.vision.v1p4beta1.Likelihood.valueOf(racy_);
      return result == null ? com.google.cloud.vision.v1p4beta1.Likelihood.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that the request image contains racy content. Racy content may
     * include (but is not limited to) skimpy or sheer clothing, strategically
     * covered nudity, lewd or provocative poses, or close-ups of sensitive
     * body areas.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
     *
     * @param value The racy to set.
     * @return This builder for chaining.
     */
    public Builder setRacy(com.google.cloud.vision.v1p4beta1.Likelihood value) {
      if (value == null) {
        throw new NullPointerException();
      }

      racy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Likelihood that the request image contains racy content. Racy content may
     * include (but is not limited to) skimpy or sheer clothing, strategically
     * covered nudity, lewd or provocative poses, or close-ups of sensitive
     * body areas.
     * </pre>
     *
     * <code>.google.cloud.vision.v1p4beta1.Likelihood racy = 9;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRacy() {

      racy_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.vision.v1p4beta1.SafeSearchAnnotation)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vision.v1p4beta1.SafeSearchAnnotation)
  private static final com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation();
  }

  public static com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SafeSearchAnnotation> PARSER =
      new com.google.protobuf.AbstractParser<SafeSearchAnnotation>() {
        @java.lang.Override
        public SafeSearchAnnotation parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SafeSearchAnnotation(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SafeSearchAnnotation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SafeSearchAnnotation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vision.v1p4beta1.SafeSearchAnnotation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
