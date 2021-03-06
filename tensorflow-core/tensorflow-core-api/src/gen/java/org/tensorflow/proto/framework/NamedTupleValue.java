// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/struct.proto

package org.tensorflow.proto.framework;

/**
 * <pre>
 * Represents Python's namedtuple.
 * </pre>
 *
 * Protobuf type {@code tensorflow.NamedTupleValue}
 */
public  final class NamedTupleValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.NamedTupleValue)
    NamedTupleValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NamedTupleValue.newBuilder() to construct.
  private NamedTupleValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NamedTupleValue() {
    name_ = "";
    values_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NamedTupleValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NamedTupleValue(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              values_ = new java.util.ArrayList<org.tensorflow.proto.framework.PairValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            values_.add(
                input.readMessage(org.tensorflow.proto.framework.PairValue.parser(), extensionRegistry));
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
        values_ = java.util.Collections.unmodifiableList(values_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.framework.StructProtos.internal_static_tensorflow_NamedTupleValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.framework.StructProtos.internal_static_tensorflow_NamedTupleValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.framework.NamedTupleValue.class, org.tensorflow.proto.framework.NamedTupleValue.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  private java.util.List<org.tensorflow.proto.framework.PairValue> values_;
  /**
   * <code>repeated .tensorflow.PairValue values = 2;</code>
   */
  public java.util.List<org.tensorflow.proto.framework.PairValue> getValuesList() {
    return values_;
  }
  /**
   * <code>repeated .tensorflow.PairValue values = 2;</code>
   */
  public java.util.List<? extends org.tensorflow.proto.framework.PairValueOrBuilder> 
      getValuesOrBuilderList() {
    return values_;
  }
  /**
   * <code>repeated .tensorflow.PairValue values = 2;</code>
   */
  public int getValuesCount() {
    return values_.size();
  }
  /**
   * <code>repeated .tensorflow.PairValue values = 2;</code>
   */
  public org.tensorflow.proto.framework.PairValue getValues(int index) {
    return values_.get(index);
  }
  /**
   * <code>repeated .tensorflow.PairValue values = 2;</code>
   */
  public org.tensorflow.proto.framework.PairValueOrBuilder getValuesOrBuilder(
      int index) {
    return values_.get(index);
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < values_.size(); i++) {
      output.writeMessage(2, values_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (int i = 0; i < values_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, values_.get(i));
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
    if (!(obj instanceof org.tensorflow.proto.framework.NamedTupleValue)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.framework.NamedTupleValue other = (org.tensorflow.proto.framework.NamedTupleValue) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getValuesList()
        .equals(other.getValuesList())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.framework.NamedTupleValue parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.framework.NamedTupleValue prototype) {
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
   * Represents Python's namedtuple.
   * </pre>
   *
   * Protobuf type {@code tensorflow.NamedTupleValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.NamedTupleValue)
      org.tensorflow.proto.framework.NamedTupleValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.framework.StructProtos.internal_static_tensorflow_NamedTupleValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.framework.StructProtos.internal_static_tensorflow_NamedTupleValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.framework.NamedTupleValue.class, org.tensorflow.proto.framework.NamedTupleValue.Builder.class);
    }

    // Construct using org.tensorflow.proto.framework.NamedTupleValue.newBuilder()
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
        getValuesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.framework.StructProtos.internal_static_tensorflow_NamedTupleValue_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.NamedTupleValue getDefaultInstanceForType() {
      return org.tensorflow.proto.framework.NamedTupleValue.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.NamedTupleValue build() {
      org.tensorflow.proto.framework.NamedTupleValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.framework.NamedTupleValue buildPartial() {
      org.tensorflow.proto.framework.NamedTupleValue result = new org.tensorflow.proto.framework.NamedTupleValue(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (valuesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.values_ = values_;
      } else {
        result.values_ = valuesBuilder_.build();
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
      if (other instanceof org.tensorflow.proto.framework.NamedTupleValue) {
        return mergeFrom((org.tensorflow.proto.framework.NamedTupleValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.framework.NamedTupleValue other) {
      if (other == org.tensorflow.proto.framework.NamedTupleValue.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (valuesBuilder_ == null) {
        if (!other.values_.isEmpty()) {
          if (values_.isEmpty()) {
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureValuesIsMutable();
            values_.addAll(other.values_);
          }
          onChanged();
        }
      } else {
        if (!other.values_.isEmpty()) {
          if (valuesBuilder_.isEmpty()) {
            valuesBuilder_.dispose();
            valuesBuilder_ = null;
            values_ = other.values_;
            bitField0_ = (bitField0_ & ~0x00000001);
            valuesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getValuesFieldBuilder() : null;
          } else {
            valuesBuilder_.addAllMessages(other.values_);
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
      org.tensorflow.proto.framework.NamedTupleValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.framework.NamedTupleValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.tensorflow.proto.framework.PairValue> values_ =
      java.util.Collections.emptyList();
    private void ensureValuesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        values_ = new java.util.ArrayList<org.tensorflow.proto.framework.PairValue>(values_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.framework.PairValue, org.tensorflow.proto.framework.PairValue.Builder, org.tensorflow.proto.framework.PairValueOrBuilder> valuesBuilder_;

    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public java.util.List<org.tensorflow.proto.framework.PairValue> getValuesList() {
      if (valuesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(values_);
      } else {
        return valuesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public int getValuesCount() {
      if (valuesBuilder_ == null) {
        return values_.size();
      } else {
        return valuesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public org.tensorflow.proto.framework.PairValue getValues(int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);
      } else {
        return valuesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder setValues(
        int index, org.tensorflow.proto.framework.PairValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.set(index, value);
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder setValues(
        int index, org.tensorflow.proto.framework.PairValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.set(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder addValues(org.tensorflow.proto.framework.PairValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder addValues(
        int index, org.tensorflow.proto.framework.PairValue value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureValuesIsMutable();
        values_.add(index, value);
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder addValues(
        org.tensorflow.proto.framework.PairValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder addValues(
        int index, org.tensorflow.proto.framework.PairValue.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.add(index, builderForValue.build());
        onChanged();
      } else {
        valuesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder addAllValues(
        java.lang.Iterable<? extends org.tensorflow.proto.framework.PairValue> values) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, values_);
        onChanged();
      } else {
        valuesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
        values_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public Builder removeValues(int index) {
      if (valuesBuilder_ == null) {
        ensureValuesIsMutable();
        values_.remove(index);
        onChanged();
      } else {
        valuesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public org.tensorflow.proto.framework.PairValue.Builder getValuesBuilder(
        int index) {
      return getValuesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public org.tensorflow.proto.framework.PairValueOrBuilder getValuesOrBuilder(
        int index) {
      if (valuesBuilder_ == null) {
        return values_.get(index);  } else {
        return valuesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public java.util.List<? extends org.tensorflow.proto.framework.PairValueOrBuilder> 
         getValuesOrBuilderList() {
      if (valuesBuilder_ != null) {
        return valuesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(values_);
      }
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public org.tensorflow.proto.framework.PairValue.Builder addValuesBuilder() {
      return getValuesFieldBuilder().addBuilder(
          org.tensorflow.proto.framework.PairValue.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public org.tensorflow.proto.framework.PairValue.Builder addValuesBuilder(
        int index) {
      return getValuesFieldBuilder().addBuilder(
          index, org.tensorflow.proto.framework.PairValue.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.PairValue values = 2;</code>
     */
    public java.util.List<org.tensorflow.proto.framework.PairValue.Builder> 
         getValuesBuilderList() {
      return getValuesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.framework.PairValue, org.tensorflow.proto.framework.PairValue.Builder, org.tensorflow.proto.framework.PairValueOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.proto.framework.PairValue, org.tensorflow.proto.framework.PairValue.Builder, org.tensorflow.proto.framework.PairValueOrBuilder>(
                values_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        values_ = null;
      }
      return valuesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.NamedTupleValue)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.NamedTupleValue)
  private static final org.tensorflow.proto.framework.NamedTupleValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.framework.NamedTupleValue();
  }

  public static org.tensorflow.proto.framework.NamedTupleValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NamedTupleValue>
      PARSER = new com.google.protobuf.AbstractParser<NamedTupleValue>() {
    @java.lang.Override
    public NamedTupleValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NamedTupleValue(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NamedTupleValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NamedTupleValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.framework.NamedTupleValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

