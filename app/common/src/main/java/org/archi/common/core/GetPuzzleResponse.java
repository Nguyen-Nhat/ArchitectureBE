// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code GetPuzzleResponse}
 */
public final class GetPuzzleResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetPuzzleResponse)
    GetPuzzleResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetPuzzleResponse.newBuilder() to construct.
  private GetPuzzleResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPuzzleResponse() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetPuzzleResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_GetPuzzleResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_GetPuzzleResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.GetPuzzleResponse.class, org.archi.common.core.GetPuzzleResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private long status_;
  /**
   * <code>int64 status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public long getStatus() {
    return status_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUZZLE_FIELD_NUMBER = 3;
  private org.archi.common.core.Puzzle puzzle_;
  /**
   * <code>.Puzzle puzzle = 3;</code>
   * @return Whether the puzzle field is set.
   */
  @java.lang.Override
  public boolean hasPuzzle() {
    return puzzle_ != null;
  }
  /**
   * <code>.Puzzle puzzle = 3;</code>
   * @return The puzzle.
   */
  @java.lang.Override
  public org.archi.common.core.Puzzle getPuzzle() {
    return puzzle_ == null ? org.archi.common.core.Puzzle.getDefaultInstance() : puzzle_;
  }
  /**
   * <code>.Puzzle puzzle = 3;</code>
   */
  @java.lang.Override
  public org.archi.common.core.PuzzleOrBuilder getPuzzleOrBuilder() {
    return getPuzzle();
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
    if (status_ != 0L) {
      output.writeInt64(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (puzzle_ != null) {
      output.writeMessage(3, getPuzzle());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (puzzle_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPuzzle());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.archi.common.core.GetPuzzleResponse)) {
      return super.equals(obj);
    }
    org.archi.common.core.GetPuzzleResponse other = (org.archi.common.core.GetPuzzleResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasPuzzle() != other.hasPuzzle()) return false;
    if (hasPuzzle()) {
      if (!getPuzzle()
          .equals(other.getPuzzle())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStatus());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasPuzzle()) {
      hash = (37 * hash) + PUZZLE_FIELD_NUMBER;
      hash = (53 * hash) + getPuzzle().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetPuzzleResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetPuzzleResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetPuzzleResponse parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.GetPuzzleResponse prototype) {
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
   * Protobuf type {@code GetPuzzleResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetPuzzleResponse)
      org.archi.common.core.GetPuzzleResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_GetPuzzleResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_GetPuzzleResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.GetPuzzleResponse.class, org.archi.common.core.GetPuzzleResponse.Builder.class);
    }

    // Construct using org.archi.common.core.GetPuzzleResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0L;

      message_ = "";

      if (puzzleBuilder_ == null) {
        puzzle_ = null;
      } else {
        puzzle_ = null;
        puzzleBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_GetPuzzleResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.GetPuzzleResponse getDefaultInstanceForType() {
      return org.archi.common.core.GetPuzzleResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.GetPuzzleResponse build() {
      org.archi.common.core.GetPuzzleResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.GetPuzzleResponse buildPartial() {
      org.archi.common.core.GetPuzzleResponse result = new org.archi.common.core.GetPuzzleResponse(this);
      result.status_ = status_;
      result.message_ = message_;
      if (puzzleBuilder_ == null) {
        result.puzzle_ = puzzle_;
      } else {
        result.puzzle_ = puzzleBuilder_.build();
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
      if (other instanceof org.archi.common.core.GetPuzzleResponse) {
        return mergeFrom((org.archi.common.core.GetPuzzleResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.GetPuzzleResponse other) {
      if (other == org.archi.common.core.GetPuzzleResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasPuzzle()) {
        mergePuzzle(other.getPuzzle());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              status_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getPuzzleFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private long status_ ;
    /**
     * <code>int64 status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public long getStatus() {
      return status_;
    }
    /**
     * <code>int64 status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(long value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private org.archi.common.core.Puzzle puzzle_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.Puzzle, org.archi.common.core.Puzzle.Builder, org.archi.common.core.PuzzleOrBuilder> puzzleBuilder_;
    /**
     * <code>.Puzzle puzzle = 3;</code>
     * @return Whether the puzzle field is set.
     */
    public boolean hasPuzzle() {
      return puzzleBuilder_ != null || puzzle_ != null;
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     * @return The puzzle.
     */
    public org.archi.common.core.Puzzle getPuzzle() {
      if (puzzleBuilder_ == null) {
        return puzzle_ == null ? org.archi.common.core.Puzzle.getDefaultInstance() : puzzle_;
      } else {
        return puzzleBuilder_.getMessage();
      }
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    public Builder setPuzzle(org.archi.common.core.Puzzle value) {
      if (puzzleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        puzzle_ = value;
        onChanged();
      } else {
        puzzleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    public Builder setPuzzle(
        org.archi.common.core.Puzzle.Builder builderForValue) {
      if (puzzleBuilder_ == null) {
        puzzle_ = builderForValue.build();
        onChanged();
      } else {
        puzzleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    public Builder mergePuzzle(org.archi.common.core.Puzzle value) {
      if (puzzleBuilder_ == null) {
        if (puzzle_ != null) {
          puzzle_ =
            org.archi.common.core.Puzzle.newBuilder(puzzle_).mergeFrom(value).buildPartial();
        } else {
          puzzle_ = value;
        }
        onChanged();
      } else {
        puzzleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    public Builder clearPuzzle() {
      if (puzzleBuilder_ == null) {
        puzzle_ = null;
        onChanged();
      } else {
        puzzle_ = null;
        puzzleBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    public org.archi.common.core.Puzzle.Builder getPuzzleBuilder() {
      
      onChanged();
      return getPuzzleFieldBuilder().getBuilder();
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    public org.archi.common.core.PuzzleOrBuilder getPuzzleOrBuilder() {
      if (puzzleBuilder_ != null) {
        return puzzleBuilder_.getMessageOrBuilder();
      } else {
        return puzzle_ == null ?
            org.archi.common.core.Puzzle.getDefaultInstance() : puzzle_;
      }
    }
    /**
     * <code>.Puzzle puzzle = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.Puzzle, org.archi.common.core.Puzzle.Builder, org.archi.common.core.PuzzleOrBuilder> 
        getPuzzleFieldBuilder() {
      if (puzzleBuilder_ == null) {
        puzzleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.archi.common.core.Puzzle, org.archi.common.core.Puzzle.Builder, org.archi.common.core.PuzzleOrBuilder>(
                getPuzzle(),
                getParentForChildren(),
                isClean());
        puzzle_ = null;
      }
      return puzzleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetPuzzleResponse)
  }

  // @@protoc_insertion_point(class_scope:GetPuzzleResponse)
  private static final org.archi.common.core.GetPuzzleResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.GetPuzzleResponse();
  }

  public static org.archi.common.core.GetPuzzleResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPuzzleResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetPuzzleResponse>() {
    @java.lang.Override
    public GetPuzzleResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetPuzzleResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPuzzleResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.GetPuzzleResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

