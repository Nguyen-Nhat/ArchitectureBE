// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code Piece}
 */
public final class Piece extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Piece)
    PieceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Piece.newBuilder() to construct.
  private Piece(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Piece() {
    image_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Piece();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_Piece_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_Piece_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.Piece.class, org.archi.common.core.Piece.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int IMAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object image_;
  /**
   * <code>string image = 2;</code>
   * @return The image.
   */
  @java.lang.Override
  public java.lang.String getImage() {
    java.lang.Object ref = image_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      image_ = s;
      return s;
    }
  }
  /**
   * <code>string image = 2;</code>
   * @return The bytes for image.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageBytes() {
    java.lang.Object ref = image_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      image_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDINAL_FIELD_NUMBER = 3;
  private int ordinal_;
  /**
   * <code>int32 ordinal = 3;</code>
   * @return The ordinal.
   */
  @java.lang.Override
  public int getOrdinal() {
    return ordinal_;
  }

  public static final int PUZZLEID_FIELD_NUMBER = 4;
  private long puzzleId_;
  /**
   * <code>int64 puzzleId = 4;</code>
   * @return The puzzleId.
   */
  @java.lang.Override
  public long getPuzzleId() {
    return puzzleId_;
  }

  public static final int QUANTITY_FIELD_NUMBER = 5;
  private int quantity_;
  /**
   * <code>int32 quantity = 5;</code>
   * @return The quantity.
   */
  @java.lang.Override
  public int getQuantity() {
    return quantity_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(image_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, image_);
    }
    if (ordinal_ != 0) {
      output.writeInt32(3, ordinal_);
    }
    if (puzzleId_ != 0L) {
      output.writeInt64(4, puzzleId_);
    }
    if (quantity_ != 0) {
      output.writeInt32(5, quantity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(image_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, image_);
    }
    if (ordinal_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, ordinal_);
    }
    if (puzzleId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, puzzleId_);
    }
    if (quantity_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, quantity_);
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
    if (!(obj instanceof org.archi.common.core.Piece)) {
      return super.equals(obj);
    }
    org.archi.common.core.Piece other = (org.archi.common.core.Piece) obj;

    if (getId()
        != other.getId()) return false;
    if (!getImage()
        .equals(other.getImage())) return false;
    if (getOrdinal()
        != other.getOrdinal()) return false;
    if (getPuzzleId()
        != other.getPuzzleId()) return false;
    if (getQuantity()
        != other.getQuantity()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + IMAGE_FIELD_NUMBER;
    hash = (53 * hash) + getImage().hashCode();
    hash = (37 * hash) + ORDINAL_FIELD_NUMBER;
    hash = (53 * hash) + getOrdinal();
    hash = (37 * hash) + PUZZLEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPuzzleId());
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + getQuantity();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.Piece parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.Piece parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.Piece parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.Piece parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.Piece parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.Piece parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.Piece parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.Piece parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.Piece parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.Piece parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.Piece parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.Piece parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.Piece prototype) {
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
   * Protobuf type {@code Piece}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Piece)
      org.archi.common.core.PieceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_Piece_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_Piece_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.Piece.class, org.archi.common.core.Piece.Builder.class);
    }

    // Construct using org.archi.common.core.Piece.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      image_ = "";

      ordinal_ = 0;

      puzzleId_ = 0L;

      quantity_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_Piece_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.Piece getDefaultInstanceForType() {
      return org.archi.common.core.Piece.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.Piece build() {
      org.archi.common.core.Piece result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.Piece buildPartial() {
      org.archi.common.core.Piece result = new org.archi.common.core.Piece(this);
      result.id_ = id_;
      result.image_ = image_;
      result.ordinal_ = ordinal_;
      result.puzzleId_ = puzzleId_;
      result.quantity_ = quantity_;
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
      if (other instanceof org.archi.common.core.Piece) {
        return mergeFrom((org.archi.common.core.Piece)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.Piece other) {
      if (other == org.archi.common.core.Piece.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getImage().isEmpty()) {
        image_ = other.image_;
        onChanged();
      }
      if (other.getOrdinal() != 0) {
        setOrdinal(other.getOrdinal());
      }
      if (other.getPuzzleId() != 0L) {
        setPuzzleId(other.getPuzzleId());
      }
      if (other.getQuantity() != 0) {
        setQuantity(other.getQuantity());
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
              id_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              image_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              ordinal_ = input.readInt32();

              break;
            } // case 24
            case 32: {
              puzzleId_ = input.readInt64();

              break;
            } // case 32
            case 40: {
              quantity_ = input.readInt32();

              break;
            } // case 40
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

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object image_ = "";
    /**
     * <code>string image = 2;</code>
     * @return The image.
     */
    public java.lang.String getImage() {
      java.lang.Object ref = image_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        image_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string image = 2;</code>
     * @return The bytes for image.
     */
    public com.google.protobuf.ByteString
        getImageBytes() {
      java.lang.Object ref = image_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        image_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string image = 2;</code>
     * @param value The image to set.
     * @return This builder for chaining.
     */
    public Builder setImage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      image_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string image = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearImage() {
      
      image_ = getDefaultInstance().getImage();
      onChanged();
      return this;
    }
    /**
     * <code>string image = 2;</code>
     * @param value The bytes for image to set.
     * @return This builder for chaining.
     */
    public Builder setImageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      image_ = value;
      onChanged();
      return this;
    }

    private int ordinal_ ;
    /**
     * <code>int32 ordinal = 3;</code>
     * @return The ordinal.
     */
    @java.lang.Override
    public int getOrdinal() {
      return ordinal_;
    }
    /**
     * <code>int32 ordinal = 3;</code>
     * @param value The ordinal to set.
     * @return This builder for chaining.
     */
    public Builder setOrdinal(int value) {
      
      ordinal_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 ordinal = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrdinal() {
      
      ordinal_ = 0;
      onChanged();
      return this;
    }

    private long puzzleId_ ;
    /**
     * <code>int64 puzzleId = 4;</code>
     * @return The puzzleId.
     */
    @java.lang.Override
    public long getPuzzleId() {
      return puzzleId_;
    }
    /**
     * <code>int64 puzzleId = 4;</code>
     * @param value The puzzleId to set.
     * @return This builder for chaining.
     */
    public Builder setPuzzleId(long value) {
      
      puzzleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 puzzleId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPuzzleId() {
      
      puzzleId_ = 0L;
      onChanged();
      return this;
    }

    private int quantity_ ;
    /**
     * <code>int32 quantity = 5;</code>
     * @return The quantity.
     */
    @java.lang.Override
    public int getQuantity() {
      return quantity_;
    }
    /**
     * <code>int32 quantity = 5;</code>
     * @param value The quantity to set.
     * @return This builder for chaining.
     */
    public Builder setQuantity(int value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 quantity = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuantity() {
      
      quantity_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Piece)
  }

  // @@protoc_insertion_point(class_scope:Piece)
  private static final org.archi.common.core.Piece DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.Piece();
  }

  public static org.archi.common.core.Piece getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Piece>
      PARSER = new com.google.protobuf.AbstractParser<Piece>() {
    @java.lang.Override
    public Piece parsePartialFrom(
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

  public static com.google.protobuf.Parser<Piece> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Piece> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.Piece getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

