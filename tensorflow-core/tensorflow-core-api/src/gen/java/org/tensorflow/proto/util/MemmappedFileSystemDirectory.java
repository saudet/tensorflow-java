// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/util/memmapped_file_system.proto

package org.tensorflow.proto.util;

/**
 * <pre>
 * A directory of regions in a memmapped file.
 * </pre>
 *
 * Protobuf type {@code tensorflow.MemmappedFileSystemDirectory}
 */
public  final class MemmappedFileSystemDirectory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MemmappedFileSystemDirectory)
    MemmappedFileSystemDirectoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MemmappedFileSystemDirectory.newBuilder() to construct.
  private MemmappedFileSystemDirectory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MemmappedFileSystemDirectory() {
    element_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MemmappedFileSystemDirectory();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MemmappedFileSystemDirectory(
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
              element_ = new java.util.ArrayList<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement>();
              mutable_bitField0_ |= 0x00000001;
            }
            element_.add(
                input.readMessage(org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.parser(), extensionRegistry));
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
        element_ = java.util.Collections.unmodifiableList(element_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.proto.util.MemmappedFileSystemProtos.internal_static_tensorflow_MemmappedFileSystemDirectory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.proto.util.MemmappedFileSystemProtos.internal_static_tensorflow_MemmappedFileSystemDirectory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.proto.util.MemmappedFileSystemDirectory.class, org.tensorflow.proto.util.MemmappedFileSystemDirectory.Builder.class);
  }

  public static final int ELEMENT_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement> element_;
  /**
   * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
   */
  public java.util.List<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement> getElementList() {
    return element_;
  }
  /**
   * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder> 
      getElementOrBuilderList() {
    return element_;
  }
  /**
   * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
   */
  public int getElementCount() {
    return element_.size();
  }
  /**
   * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
   */
  public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement getElement(int index) {
    return element_.get(index);
  }
  /**
   * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
   */
  public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder getElementOrBuilder(
      int index) {
    return element_.get(index);
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
    for (int i = 0; i < element_.size(); i++) {
      output.writeMessage(1, element_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < element_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, element_.get(i));
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
    if (!(obj instanceof org.tensorflow.proto.util.MemmappedFileSystemDirectory)) {
      return super.equals(obj);
    }
    org.tensorflow.proto.util.MemmappedFileSystemDirectory other = (org.tensorflow.proto.util.MemmappedFileSystemDirectory) obj;

    if (!getElementList()
        .equals(other.getElementList())) return false;
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
    if (getElementCount() > 0) {
      hash = (37 * hash) + ELEMENT_FIELD_NUMBER;
      hash = (53 * hash) + getElementList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory parseFrom(
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
  public static Builder newBuilder(org.tensorflow.proto.util.MemmappedFileSystemDirectory prototype) {
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
   * A directory of regions in a memmapped file.
   * </pre>
   *
   * Protobuf type {@code tensorflow.MemmappedFileSystemDirectory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MemmappedFileSystemDirectory)
      org.tensorflow.proto.util.MemmappedFileSystemDirectoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.proto.util.MemmappedFileSystemProtos.internal_static_tensorflow_MemmappedFileSystemDirectory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.proto.util.MemmappedFileSystemProtos.internal_static_tensorflow_MemmappedFileSystemDirectory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.proto.util.MemmappedFileSystemDirectory.class, org.tensorflow.proto.util.MemmappedFileSystemDirectory.Builder.class);
    }

    // Construct using org.tensorflow.proto.util.MemmappedFileSystemDirectory.newBuilder()
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
        getElementFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (elementBuilder_ == null) {
        element_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        elementBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.proto.util.MemmappedFileSystemProtos.internal_static_tensorflow_MemmappedFileSystemDirectory_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.MemmappedFileSystemDirectory getDefaultInstanceForType() {
      return org.tensorflow.proto.util.MemmappedFileSystemDirectory.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.proto.util.MemmappedFileSystemDirectory build() {
      org.tensorflow.proto.util.MemmappedFileSystemDirectory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.proto.util.MemmappedFileSystemDirectory buildPartial() {
      org.tensorflow.proto.util.MemmappedFileSystemDirectory result = new org.tensorflow.proto.util.MemmappedFileSystemDirectory(this);
      int from_bitField0_ = bitField0_;
      if (elementBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          element_ = java.util.Collections.unmodifiableList(element_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.element_ = element_;
      } else {
        result.element_ = elementBuilder_.build();
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
      if (other instanceof org.tensorflow.proto.util.MemmappedFileSystemDirectory) {
        return mergeFrom((org.tensorflow.proto.util.MemmappedFileSystemDirectory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.proto.util.MemmappedFileSystemDirectory other) {
      if (other == org.tensorflow.proto.util.MemmappedFileSystemDirectory.getDefaultInstance()) return this;
      if (elementBuilder_ == null) {
        if (!other.element_.isEmpty()) {
          if (element_.isEmpty()) {
            element_ = other.element_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureElementIsMutable();
            element_.addAll(other.element_);
          }
          onChanged();
        }
      } else {
        if (!other.element_.isEmpty()) {
          if (elementBuilder_.isEmpty()) {
            elementBuilder_.dispose();
            elementBuilder_ = null;
            element_ = other.element_;
            bitField0_ = (bitField0_ & ~0x00000001);
            elementBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getElementFieldBuilder() : null;
          } else {
            elementBuilder_.addAllMessages(other.element_);
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
      org.tensorflow.proto.util.MemmappedFileSystemDirectory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.proto.util.MemmappedFileSystemDirectory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement> element_ =
      java.util.Collections.emptyList();
    private void ensureElementIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        element_ = new java.util.ArrayList<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement>(element_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder> elementBuilder_;

    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public java.util.List<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement> getElementList() {
      if (elementBuilder_ == null) {
        return java.util.Collections.unmodifiableList(element_);
      } else {
        return elementBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public int getElementCount() {
      if (elementBuilder_ == null) {
        return element_.size();
      } else {
        return elementBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement getElement(int index) {
      if (elementBuilder_ == null) {
        return element_.get(index);
      } else {
        return elementBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder setElement(
        int index, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementIsMutable();
        element_.set(index, value);
        onChanged();
      } else {
        elementBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder setElement(
        int index, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.set(index, builderForValue.build());
        onChanged();
      } else {
        elementBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder addElement(org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementIsMutable();
        element_.add(value);
        onChanged();
      } else {
        elementBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder addElement(
        int index, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement value) {
      if (elementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureElementIsMutable();
        element_.add(index, value);
        onChanged();
      } else {
        elementBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder addElement(
        org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.add(builderForValue.build());
        onChanged();
      } else {
        elementBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder addElement(
        int index, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder builderForValue) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.add(index, builderForValue.build());
        onChanged();
      } else {
        elementBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder addAllElement(
        java.lang.Iterable<? extends org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement> values) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, element_);
        onChanged();
      } else {
        elementBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder clearElement() {
      if (elementBuilder_ == null) {
        element_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        elementBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public Builder removeElement(int index) {
      if (elementBuilder_ == null) {
        ensureElementIsMutable();
        element_.remove(index);
        onChanged();
      } else {
        elementBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder getElementBuilder(
        int index) {
      return getElementFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder getElementOrBuilder(
        int index) {
      if (elementBuilder_ == null) {
        return element_.get(index);  } else {
        return elementBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder> 
         getElementOrBuilderList() {
      if (elementBuilder_ != null) {
        return elementBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(element_);
      }
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder addElementBuilder() {
      return getElementFieldBuilder().addBuilder(
          org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder addElementBuilder(
        int index) {
      return getElementFieldBuilder().addBuilder(
          index, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.getDefaultInstance());
    }
    /**
     * <code>repeated .tensorflow.MemmappedFileSystemDirectoryElement element = 1;</code>
     */
    public java.util.List<org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder> 
         getElementBuilderList() {
      return getElementFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder> 
        getElementFieldBuilder() {
      if (elementBuilder_ == null) {
        elementBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElement.Builder, org.tensorflow.proto.util.MemmappedFileSystemDirectoryElementOrBuilder>(
                element_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        element_ = null;
      }
      return elementBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.MemmappedFileSystemDirectory)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MemmappedFileSystemDirectory)
  private static final org.tensorflow.proto.util.MemmappedFileSystemDirectory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.proto.util.MemmappedFileSystemDirectory();
  }

  public static org.tensorflow.proto.util.MemmappedFileSystemDirectory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MemmappedFileSystemDirectory>
      PARSER = new com.google.protobuf.AbstractParser<MemmappedFileSystemDirectory>() {
    @java.lang.Override
    public MemmappedFileSystemDirectory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MemmappedFileSystemDirectory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MemmappedFileSystemDirectory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MemmappedFileSystemDirectory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.proto.util.MemmappedFileSystemDirectory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
