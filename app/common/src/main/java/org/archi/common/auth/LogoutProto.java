// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: logout.proto

package org.archi.common.auth;

public final class LogoutProto {
  private LogoutProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLogoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLogoutResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014logout.proto\"(\n\021PostLogoutRequest\022\023\n\013a" +
      "ccessToken\030\001 \001(\t\"5\n\022PostLogoutResponse\022\016" +
      "\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t2F\n\rLogou" +
      "tService\0225\n\nPostLogout\022\022.PostLogoutReque" +
      "st\032\023.PostLogoutResponseB&\n\025org.archi.com" +
      "mon.authB\013LogoutProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PostLogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PostLogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLogoutRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_PostLogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PostLogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLogoutResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
