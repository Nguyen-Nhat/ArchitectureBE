// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: core.proto
// Protobuf Java Version: 4.29.1

package org.archi.common.core;

/**
 * Protobuf type {@code UpdateCampaignRes}
 */
public final class UpdateCampaignRes extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:UpdateCampaignRes)
    UpdateCampaignResOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      UpdateCampaignRes.class.getName());
  }
  // Use UpdateCampaignRes.newBuilder() to construct.
  private UpdateCampaignRes(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UpdateCampaignRes() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_UpdateCampaignRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_UpdateCampaignRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.UpdateCampaignRes.class, org.archi.common.core.UpdateCampaignRes.Builder.class);
  }

  private int bitField0_;
  public static final int CAMPAIGN_FIELD_NUMBER = 1;
  private org.archi.common.core.Campaign campaign_;
  /**
   * <code>.Campaign campaign = 1;</code>
   * @return Whether the campaign field is set.
   */
  @java.lang.Override
  public boolean hasCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.Campaign campaign = 1;</code>
   * @return The campaign.
   */
  @java.lang.Override
  public org.archi.common.core.Campaign getCampaign() {
    return campaign_ == null ? org.archi.common.core.Campaign.getDefaultInstance() : campaign_;
  }
  /**
   * <code>.Campaign campaign = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.CampaignOrBuilder getCampaignOrBuilder() {
    return campaign_ == null ? org.archi.common.core.Campaign.getDefaultInstance() : campaign_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCampaign());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCampaign());
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
    if (!(obj instanceof org.archi.common.core.UpdateCampaignRes)) {
      return super.equals(obj);
    }
    org.archi.common.core.UpdateCampaignRes other = (org.archi.common.core.UpdateCampaignRes) obj;

    if (hasCampaign() != other.hasCampaign()) return false;
    if (hasCampaign()) {
      if (!getCampaign()
          .equals(other.getCampaign())) return false;
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
    if (hasCampaign()) {
      hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getCampaign().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.archi.common.core.UpdateCampaignRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.archi.common.core.UpdateCampaignRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateCampaignRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.archi.common.core.UpdateCampaignRes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UpdateCampaignRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateCampaignRes)
      org.archi.common.core.UpdateCampaignResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_UpdateCampaignRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_UpdateCampaignRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.UpdateCampaignRes.class, org.archi.common.core.UpdateCampaignRes.Builder.class);
    }

    // Construct using org.archi.common.core.UpdateCampaignRes.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getCampaignFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      campaign_ = null;
      if (campaignBuilder_ != null) {
        campaignBuilder_.dispose();
        campaignBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_UpdateCampaignRes_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateCampaignRes getDefaultInstanceForType() {
      return org.archi.common.core.UpdateCampaignRes.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.UpdateCampaignRes build() {
      org.archi.common.core.UpdateCampaignRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateCampaignRes buildPartial() {
      org.archi.common.core.UpdateCampaignRes result = new org.archi.common.core.UpdateCampaignRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.archi.common.core.UpdateCampaignRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campaign_ = campaignBuilder_ == null
            ? campaign_
            : campaignBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.archi.common.core.UpdateCampaignRes) {
        return mergeFrom((org.archi.common.core.UpdateCampaignRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.UpdateCampaignRes other) {
      if (other == org.archi.common.core.UpdateCampaignRes.getDefaultInstance()) return this;
      if (other.hasCampaign()) {
        mergeCampaign(other.getCampaign());
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
            case 10: {
              input.readMessage(
                  getCampaignFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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
    private int bitField0_;

    private org.archi.common.core.Campaign campaign_;
    private com.google.protobuf.SingleFieldBuilder<
        org.archi.common.core.Campaign, org.archi.common.core.Campaign.Builder, org.archi.common.core.CampaignOrBuilder> campaignBuilder_;
    /**
     * <code>.Campaign campaign = 1;</code>
     * @return Whether the campaign field is set.
     */
    public boolean hasCampaign() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     * @return The campaign.
     */
    public org.archi.common.core.Campaign getCampaign() {
      if (campaignBuilder_ == null) {
        return campaign_ == null ? org.archi.common.core.Campaign.getDefaultInstance() : campaign_;
      } else {
        return campaignBuilder_.getMessage();
      }
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    public Builder setCampaign(org.archi.common.core.Campaign value) {
      if (campaignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaign_ = value;
      } else {
        campaignBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    public Builder setCampaign(
        org.archi.common.core.Campaign.Builder builderForValue) {
      if (campaignBuilder_ == null) {
        campaign_ = builderForValue.build();
      } else {
        campaignBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    public Builder mergeCampaign(org.archi.common.core.Campaign value) {
      if (campaignBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          campaign_ != null &&
          campaign_ != org.archi.common.core.Campaign.getDefaultInstance()) {
          getCampaignBuilder().mergeFrom(value);
        } else {
          campaign_ = value;
        }
      } else {
        campaignBuilder_.mergeFrom(value);
      }
      if (campaign_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    public Builder clearCampaign() {
      bitField0_ = (bitField0_ & ~0x00000001);
      campaign_ = null;
      if (campaignBuilder_ != null) {
        campaignBuilder_.dispose();
        campaignBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    public org.archi.common.core.Campaign.Builder getCampaignBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCampaignFieldBuilder().getBuilder();
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    public org.archi.common.core.CampaignOrBuilder getCampaignOrBuilder() {
      if (campaignBuilder_ != null) {
        return campaignBuilder_.getMessageOrBuilder();
      } else {
        return campaign_ == null ?
            org.archi.common.core.Campaign.getDefaultInstance() : campaign_;
      }
    }
    /**
     * <code>.Campaign campaign = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.archi.common.core.Campaign, org.archi.common.core.Campaign.Builder, org.archi.common.core.CampaignOrBuilder> 
        getCampaignFieldBuilder() {
      if (campaignBuilder_ == null) {
        campaignBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.archi.common.core.Campaign, org.archi.common.core.Campaign.Builder, org.archi.common.core.CampaignOrBuilder>(
                getCampaign(),
                getParentForChildren(),
                isClean());
        campaign_ = null;
      }
      return campaignBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:UpdateCampaignRes)
  }

  // @@protoc_insertion_point(class_scope:UpdateCampaignRes)
  private static final org.archi.common.core.UpdateCampaignRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.UpdateCampaignRes();
  }

  public static org.archi.common.core.UpdateCampaignRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateCampaignRes>
      PARSER = new com.google.protobuf.AbstractParser<UpdateCampaignRes>() {
    @java.lang.Override
    public UpdateCampaignRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateCampaignRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateCampaignRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.UpdateCampaignRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

