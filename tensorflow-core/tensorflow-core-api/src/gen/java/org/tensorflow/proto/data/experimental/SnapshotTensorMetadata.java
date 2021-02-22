// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/data/experimental/snapshot.proto

package org.tensorflow.proto.data.experimental;

/**
 * <pre>
 * Metadata for all the tensors in a Snapshot Record.
 * </pre>
 *
 * Protobuf type {@code tensorflow.data.experimental.SnapshotTensorMetadata}
 */
public  final class SnapshotTensorMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.data.experimental.SnapshotTensorMetadata)
    SnapshotTensorMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SnapshotTensorMetadata.newBuilder() to construct.
  private SnapshotTensorMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SnapshotTensorMetadata() {
    tensorMetadata_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SnapshotTensorMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SnapshotTensorMetadata(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tensorMetadata_ = new java.util.ArrayList<org.tensorflow.proto.data.experimental.TensorMetadata>();
              mutable_bitField0_ |= 0x00000001;
            }
            tensorMetadata_.add(
                input.readMessage(org.tensorflow.proto.data.experimental.TensorMetadata.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tensorMetadata_ = java.util.Collections.unmodifiableList(tensorMetadata_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.data.experimental.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.data.experimental.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.class, org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.Builder.class);
  }

  public static final int TENSOR_METADATA_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.proto.data.experimental.TensorMetadata> tensorMetadata_;
  /**
   * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
   */
  public java.util.List<org.tensorflow.proto.data.experimental.TensorMetadata> getTensorMetadataList() {
    return tensorMetadata_;
  }
  /**
   * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder> 
      getTensorMetadataOrBuilderList() {
    return tensorMetadata_;
  }
  /**
   * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
   */
  public int getTensorMetadataCount() {
    return tensorMetadata_.size();
  }
  /**
   * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
   */
  public org.tensorflow.proto.data.experimental.TensorMetadata getTensorMetadata(int index) {
    return tensorMetadata_.get(index);
  }
  /**
   * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
   */
  public org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder getTensorMetadataOrBuilder(
      int index) {
    return tensorMetadata_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < tensorMetadata_.size(); i++) {
      output.writeMessage(1, tensorMetadata_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tensorMetadata_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tensorMetadata_.get(i));
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
    if (!(obj instanceof org.tensorflow.proto.data.experimental.SnapshotTensorMetadata)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.data.experimental.SnapshotTensorMetadata other = (org.tensorflow.proto.data.experimental.SnapshotTensorMetadata) obj;

    if (!getTensorMetadataList()
        .equals(other.getTensorMetadataList())) return false;
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
    if (getTensorMetadataCount() > 0) {
      hash = (37 * hash) + TENSOR_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getTensorMetadataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.proto.data.experimental.SnapshotTensorMetadata prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Metadata for all the tensors in a Snapshot Record.
   * </pre>
   *
   * Protobuf type {@code tensorflow.data.experimental.SnapshotTensorMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.data.experimental.SnapshotTensorMetadata)
      org.tensorflow.proto.data.experimental.SnapshotTensorMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.data.experimental.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.data.experimental.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.class, org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.Builder.class);
    }

    // Construct using org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTensorMetadataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tensorMetadataBuilder_ == null) {
        tensorMetadata_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tensorMetadataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.data.experimental.SnapshotProtos.internal_static_tensorflow_data_experimental_SnapshotTensorMetadata_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.experimental.SnapshotTensorMetadata getDefaultInstanceForType() {
      return org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.data.experimental.SnapshotTensorMetadata build() {
      org.tensorflow.proto.data.experimental.SnapshotTensorMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.data.experimental.SnapshotTensorMetadata buildPartial() {
      org.tensorflow.proto.data.experimental.SnapshotTensorMetadata result = new org.tensorflow.proto.data.experimental.SnapshotTensorMetadata(this);
      int from_bitField0_ = bitField0_;
      if (tensorMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tensorMetadata_ = java.util.Collections.unmodifiableList(tensorMetadata_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tensorMetadata_ = tensorMetadata_;
      } else {
        result.tensorMetadata_ = tensorMetadataBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.proto.data.experimental.SnapshotTensorMetadata) {
        return mergeFrom((org.tensorflow.proto.data.experimental.SnapshotTensorMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.data.experimental.SnapshotTensorMetadata other) {
      if (other == org.tensorflow.proto.data.experimental.SnapshotTensorMetadata.getDefaultInstance()) return this;
      if (tensorMetadataBuilder_ == null) {
        if (!other.tensorMetadata_.isEmpty()) {
          if (tensorMetadata_.isEmpty()) {
            tensorMetadata_ = other.tensorMetadata_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTensorMetadataIsMutable();
            tensorMetadata_.addAll(other.tensorMetadata_);
          }
          onChanged();
        }
      } else {
        if (!other.tensorMetadata_.isEmpty()) {
          if (tensorMetadataBuilder_.isEmpty()) {
            tensorMetadataBuilder_.dispose();
            tensorMetadataBuilder_ = null;
            tensorMetadata_ = other.tensorMetadata_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tensorMetadataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTensorMetadataFieldBuilder() : null;
          } else {
            tensorMetadataBuilder_.addAllMessages(other.tensorMetadata_);
          }
        }
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
      org.tensorflow.proto.data.experimental.SnapshotTensorMetadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.data.experimental.SnapshotTensorMetadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.proto.data.experimental.TensorMetadata> tensorMetadata_ =
      java.util.Collections.emptyList();
    private void ensureTensorMetadataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tensorMetadata_ = new java.util.ArrayList<org.tensorflow.proto.data.experimental.TensorMetadata>(tensorMetadata_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.data.experimental.TensorMetadata, org.tensorflow.proto.data.experimental.TensorMetadata.Builder, org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder> tensorMetadataBuilder_;

    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public java.util.List<org.tensorflow.proto.data.experimental.TensorMetadata> getTensorMetadataList() {
      if (tensorMetadataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensorMetadata_);
      } else {
        return tensorMetadataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public int getTensorMetadataCount() {
      if (tensorMetadataBuilder_ == null) {
        return tensorMetadata_.size();
      } else {
        return tensorMetadataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public org.tensorflow.proto.data.experimental.TensorMetadata getTensorMetadata(int index) {
      if (tensorMetadataBuilder_ == null) {
        return tensorMetadata_.get(index);
      } else {
        return tensorMetadataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder setTensorMetadata(
        int index, org.tensorflow.proto.data.experimental.TensorMetadata value) {
      if (tensorMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorMetadataIsMutable();
        tensorMetadata_.set(index, value);
        onChanged();
      } else {
        tensorMetadataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder setTensorMetadata(
        int index, org.tensorflow.proto.data.experimental.TensorMetadata.Builder builderForValue) {
      if (tensorMetadataBuilder_ == null) {
        ensureTensorMetadataIsMutable();
        tensorMetadata_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorMetadataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder addTensorMetadata(org.tensorflow.proto.data.experimental.TensorMetadata value) {
      if (tensorMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorMetadataIsMutable();
        tensorMetadata_.add(value);
        onChanged();
      } else {
        tensorMetadataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder addTensorMetadata(
        int index, org.tensorflow.proto.data.experimental.TensorMetadata value) {
      if (tensorMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorMetadataIsMutable();
        tensorMetadata_.add(index, value);
        onChanged();
      } else {
        tensorMetadataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder addTensorMetadata(
        org.tensorflow.proto.data.experimental.TensorMetadata.Builder builderForValue) {
      if (tensorMetadataBuilder_ == null) {
        ensureTensorMetadataIsMutable();
        tensorMetadata_.add(builderForValue.build());
        onChanged();
      } else {
        tensorMetadataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder addTensorMetadata(
        int index, org.tensorflow.proto.data.experimental.TensorMetadata.Builder builderForValue) {
      if (tensorMetadataBuilder_ == null) {
        ensureTensorMetadataIsMutable();
        tensorMetadata_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorMetadataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder addAllTensorMetadata(
        java.lang.Iterable<? extends org.tensorflow.proto.data.experimental.TensorMetadata> values) {
      if (tensorMetadataBuilder_ == null) {
        ensureTensorMetadataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tensorMetadata_);
        onChanged();
      } else {
        tensorMetadataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder clearTensorMetadata() {
      if (tensorMetadataBuilder_ == null) {
        tensorMetadata_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tensorMetadataBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public Builder removeTensorMetadata(int index) {
      if (tensorMetadataBuilder_ == null) {
        ensureTensorMetadataIsMutable();
        tensorMetadata_.remove(index);
        onChanged();
      } else {
        tensorMetadataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public org.tensorflow.proto.data.experimental.TensorMetadata.Builder getTensorMetadataBuilder(
        int index) {
      return getTensorMetadataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder getTensorMetadataOrBuilder(
        int index) {
      if (tensorMetadataBuilder_ == null) {
        return tensorMetadata_.get(index);  } else {
        return tensorMetadataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder> 
         getTensorMetadataOrBuilderList() {
      if (tensorMetadataBuilder_ != null) {
        return tensorMetadataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensorMetadata_);
      }
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public org.tensorflow.proto.data.experimental.TensorMetadata.Builder addTensorMetadataBuilder() {
      return getTensorMetadataFieldBuilder().addBuilder(
          org.tensorflow.proto.data.experimental.TensorMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public org.tensorflow.proto.data.experimental.TensorMetadata.Builder addTensorMetadataBuilder(
        int index) {
      return getTensorMetadataFieldBuilder().addBuilder(
          index, org.tensorflow.proto.data.experimental.TensorMetadata.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.data.experimental.TensorMetadata tensor_metadata = 1;</code>
     */
    public java.util.List<org.tensorflow.proto.data.experimental.TensorMetadata.Builder> 
         getTensorMetadataBuilderList() {
      return getTensorMetadataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.data.experimental.TensorMetadata, org.tensorflow.proto.data.experimental.TensorMetadata.Builder, org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder> 
        getTensorMetadataFieldBuilder() {
      if (tensorMetadataBuilder_ == null) {
        tensorMetadataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.proto.data.experimental.TensorMetadata, org.tensorflow.proto.data.experimental.TensorMetadata.Builder, org.tensorflow.proto.data.experimental.TensorMetadataOrBuilder>(
                tensorMetadata_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tensorMetadata_ = null;
      }
      return tensorMetadataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.data.experimental.SnapshotTensorMetadata)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.data.experimental.SnapshotTensorMetadata)
  private static final org.tensorflow.proto.data.experimental.SnapshotTensorMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.data.experimental.SnapshotTensorMetadata();
  }

  public static org.tensorflow.proto.data.experimental.SnapshotTensorMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SnapshotTensorMetadata>
      PARSER = new com.google.protobuf.AbstractParser<SnapshotTensorMetadata>() {
    @java.lang.Override
    public SnapshotTensorMetadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SnapshotTensorMetadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SnapshotTensorMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SnapshotTensorMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.data.experimental.SnapshotTensorMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
