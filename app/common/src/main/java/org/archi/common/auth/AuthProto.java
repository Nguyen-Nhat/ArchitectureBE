// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.archi.common.auth;

public final class AuthProto {
  private AuthProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostCreateAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostCreateAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostCreateAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostCreateAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PutUpdateAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PutUpdateAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PutUpdateAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PutUpdateAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAccountInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAccountInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAccountInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAccountInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRegisterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRegisterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRegisterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRegisterResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLoginResponse_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRefreshTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRefreshTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRefreshTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRefreshTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetVerifyEmailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetVerifyEmailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetVerifyEmailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetVerifyEmailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostVerifyTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostVerifyTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostVerifyTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostVerifyTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBrandInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBrandInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBrandInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBrandInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nauth.proto\"p\n\030PostCreateAccountRequest" +
      "\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\r\n\005" +
      "email\030\003 \001(\t\022\023\n\013phoneNumber\030\004 \001(\t\022\014\n\004role" +
      "\030\005 \001(\t\"<\n\031PostCreateAccountResponse\022\016\n\006s" +
      "tatus\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\"[\n\027PutUpdat" +
      "eAccountRequest\022\n\n\002id\030\001 \001(\003\022\r\n\005email\030\002 \001" +
      "(\t\022\023\n\013phoneNumber\030\003 \001(\t\022\020\n\010isActive\030\005 \001(" +
      "\010\";\n\030PutUpdateAccountResponse\022\016\n\006status\030" +
      "\001 \001(\003\022\017\n\007message\030\002 \001(\t\"\"\n\024DeleteAccountR" +
      "equest\022\n\n\002id\030\001 \001(\003\"8\n\025DeleteAccountRespo" +
      "nse\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\"#\n\025" +
      "GetAccountInfoRequest\022\n\n\002id\030\001 \001(\003\"\233\001\n\026Ge" +
      "tAccountInfoResponse\022\016\n\006status\030\001 \001(\003\022\017\n\007" +
      "message\030\002 \001(\t\022\n\n\002id\030\003 \001(\003\022\020\n\010username\030\004 " +
      "\001(\t\022\r\n\005email\030\005 \001(\t\022\023\n\013phoneNumber\030\006 \001(\t\022" +
      "\014\n\004role\030\007 \001(\t\022\020\n\010isActive\030\010 \001(\010\"k\n\023PostR" +
      "egisterRequest\022\020\n\010username\030\002 \001(\t\022\020\n\010pass" +
      "word\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\023\n\013phoneNumber" +
      "\030\005 \001(\t\022\014\n\004role\030\006 \001(\t\"7\n\024PostRegisterResp" +
      "onse\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\"6\n" +
      "\020PostLoginRequest\022\020\n\010username\030\001 \001(\t\022\020\n\010p" +
      "assword\030\002 \001(\t\"\205\001\n\021PostLoginResponse\022\016\n\006s" +
      "tatus\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\023\n\013accessTo" +
      "ken\030\003 \001(\t\022\024\n\014refreshToken\030\004 \001(\t\022\021\n\ttoken" +
      "Type\030\005 \001(\t\022\021\n\texpiresIn\030\006 \001(\003\"(\n\021PostLog" +
      "outRequest\022\023\n\013accessToken\030\001 \001(\t\"5\n\022PostL" +
      "ogoutResponse\022\016\n\006status\030\001 \001(\003\022\017\n\007message" +
      "\030\002 \001(\t\"/\n\027PostRefreshTokenRequest\022\024\n\014ref" +
      "reshToken\030\001 \001(\t\"v\n\030PostRefreshTokenRespo" +
      "nse\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\023\n\013" +
      "accessToken\030\003 \001(\t\022\021\n\texpiresIn\030\004 \001(\003\022\021\n\t" +
      "tokenType\030\005 \001(\t\"&\n\025GetVerifyEmailRequest" +
      "\022\r\n\005token\030\001 \001(\t\"9\n\026GetVerifyEmailRespons" +
      "e\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\"\'\n\026Po" +
      "stVerifyTokenRequest\022\r\n\005token\030\001 \001(\t\"T\n\027P" +
      "ostVerifyTokenResponse\022\016\n\006status\030\001 \001(\003\022\017" +
      "\n\007message\030\002 \001(\t\022\n\n\002id\030\003 \001(\003\022\014\n\004role\030\004 \001(" +
      "\t\"!\n\023GetBrandInfoRequest\022\n\n\002id\030\001 \001(\003\"\220\001\n" +
      "\024GetBrandInfoResponse\022\016\n\006status\030\001 \001(\003\022\017\n" +
      "\007message\030\002 \001(\t\022\n\n\002id\030\003 \001(\003\022\014\n\004name\030\004 \001(\t" +
      "\022\r\n\005field\030\005 \001(\t\022\017\n\007address\030\006 \001(\t\022\013\n\003gps\030" +
      "\007 \001(\t\022\020\n\010isEnable\030\010 \001(\010\"\"\n\024GetPlayerInfo" +
      "Request\022\n\n\002id\030\001 \001(\003\"\227\001\n\025GetPlayerInfoRes" +
      "ponse\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\n" +
      "\n\002id\030\003 \001(\003\022\014\n\004name\030\004 \001(\t\022\016\n\006avatar\030\005 \001(\t" +
      "\022\021\n\tbirthDate\030\006 \001(\003\022\016\n\006gender\030\007 \001(\t\022\020\n\010f" +
      "acebook\030\010 \001(\t2\234\006\n\013AuthService\022;\n\014PostReg" +
      "ister\022\024.PostRegisterRequest\032\025.PostRegist" +
      "erResponse\0222\n\tPostLogin\022\021.PostLoginReque" +
      "st\032\022.PostLoginResponse\0225\n\nPostLogout\022\022.P" +
      "ostLogoutRequest\032\023.PostLogoutResponse\022G\n" +
      "\020PostRefreshToken\022\030.PostRefreshTokenRequ" +
      "est\032\031.PostRefreshTokenResponse\022A\n\016GetVer" +
      "ifyEmail\022\026.GetVerifyEmailRequest\032\027.GetVe" +
      "rifyEmailResponse\022D\n\017PostVerifyToken\022\027.P" +
      "ostVerifyTokenRequest\032\030.PostVerifyTokenR" +
      "esponse\022;\n\014GetBrandInfo\022\024.GetBrandInfoRe" +
      "quest\032\025.GetBrandInfoResponse\022>\n\rGetPlaye" +
      "rInfo\022\025.GetPlayerInfoRequest\032\026.GetPlayer" +
      "InfoResponse\022A\n\016GetAccountInfo\022\026.GetAcco" +
      "untInfoRequest\032\027.GetAccountInfoResponse\022" +
      "J\n\021PostCreateAccount\022\031.PostCreateAccount" +
      "Request\032\032.PostCreateAccountResponse\022>\n\rD" +
      "eleteAccount\022\025.DeleteAccountRequest\032\026.De" +
      "leteAccountResponse\022G\n\020PutUpdateAccount\022" +
      "\030.PutUpdateAccountRequest\032\031.PutUpdateAcc" +
      "ountResponse2\017\n\rLogoutServiceB$\n\025org.arc" +
      "hi.common.authB\tAuthProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PostCreateAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PostCreateAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostCreateAccountRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Email", "PhoneNumber", "Role", });
    internal_static_PostCreateAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PostCreateAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostCreateAccountResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PutUpdateAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_PutUpdateAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PutUpdateAccountRequest_descriptor,
        new java.lang.String[] { "Id", "Email", "PhoneNumber", "IsActive", });
    internal_static_PutUpdateAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_PutUpdateAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PutUpdateAccountResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_DeleteAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_DeleteAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteAccountRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_DeleteAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_DeleteAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteAccountResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_GetAccountInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GetAccountInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAccountInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetAccountInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GetAccountInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAccountInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Username", "Email", "PhoneNumber", "Role", "IsActive", });
    internal_static_PostRegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_PostRegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRegisterRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Email", "PhoneNumber", "Role", });
    internal_static_PostRegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_PostRegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRegisterResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PostLoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_PostLoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_PostLoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_PostLoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLoginResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "RefreshToken", "TokenType", "ExpiresIn", });
    internal_static_PostLogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_PostLogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLogoutRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_PostLogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_PostLogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLogoutResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PostRefreshTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_PostRefreshTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRefreshTokenRequest_descriptor,
        new java.lang.String[] { "RefreshToken", });
    internal_static_PostRefreshTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_PostRefreshTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRefreshTokenResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "ExpiresIn", "TokenType", });
    internal_static_GetVerifyEmailRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_GetVerifyEmailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetVerifyEmailRequest_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_GetVerifyEmailResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_GetVerifyEmailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetVerifyEmailResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PostVerifyTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_PostVerifyTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostVerifyTokenRequest_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_PostVerifyTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_PostVerifyTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostVerifyTokenResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Role", });
    internal_static_GetBrandInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_GetBrandInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBrandInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetBrandInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_GetBrandInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBrandInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Name", "Field", "Address", "Gps", "IsEnable", });
    internal_static_GetPlayerInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(22);
    internal_static_GetPlayerInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetPlayerInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(23);
    internal_static_GetPlayerInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Name", "Avatar", "BirthDate", "Gender", "Facebook", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
