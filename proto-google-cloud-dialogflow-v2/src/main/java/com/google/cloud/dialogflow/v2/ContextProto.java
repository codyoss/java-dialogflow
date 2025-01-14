/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dialogflow/v2/context.proto

package com.google.cloud.dialogflow.v2;

public final class ContextProto {
  private ContextProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_Context_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListContextsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListContextsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_ListContextsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_ListContextsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_GetContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_GetContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_CreateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/dialogflow/v2/context.pro"
          + "to\022\032google.cloud.dialogflow.v2\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\033google/protob"
          + "uf/empty.proto\032 google/protobuf/field_ma"
          + "sk.proto\032\034google/protobuf/struct.proto\"\323"
          + "\001\n\007Context\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\033\n\016lifespa"
          + "n_count\030\002 \001(\005B\003\340A\001\0220\n\nparameters\030\003 \001(\0132\027"
          + ".google.protobuf.StructB\003\340A\001:f\352Ac\n!dialo"
          + "gflow.googleapis.com/Context\022>projects/{"
          + "project}/agent/sessions/{session}/contex"
          + "ts/{context}\"[\n\023ListContextsRequest\022\023\n\006p"
          + "arent\030\001 \001(\tB\003\340A\002\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001"
          + "\022\027\n\npage_token\030\003 \001(\tB\003\340A\001\"f\n\024ListContext"
          + "sResponse\0225\n\010contexts\030\001 \003(\0132#.google.clo"
          + "ud.dialogflow.v2.Context\022\027\n\017next_page_to"
          + "ken\030\002 \001(\t\"L\n\021GetContextRequest\0227\n\004name\030\001"
          + " \001(\tB)\340A\002\372A#\n!dialogflow.googleapis.com/"
          + "Context\"f\n\024CreateContextRequest\022\023\n\006paren"
          + "t\030\001 \001(\tB\003\340A\002\0229\n\007context\030\002 \001(\0132#.google.c"
          + "loud.dialogflow.v2.ContextB\003\340A\002\"\207\001\n\024Upda"
          + "teContextRequest\0229\n\007context\030\001 \001(\0132#.goog"
          + "le.cloud.dialogflow.v2.ContextB\003\340A\002\0224\n\013u"
          + "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field"
          + "MaskB\003\340A\001\"O\n\024DeleteContextRequest\0227\n\004nam"
          + "e\030\001 \001(\tB)\340A\002\372A#\n!dialogflow.googleapis.c"
          + "om/Context\"/\n\030DeleteAllContextsRequest\022\023"
          + "\n\006parent\030\001 \001(\tB\003\340A\0022\362\010\n\010Contexts\022\265\001\n\014Lis"
          + "tContexts\022/.google.cloud.dialogflow.v2.L"
          + "istContextsRequest\0320.google.cloud.dialog"
          + "flow.v2.ListContextsResponse\"B\202\323\344\223\0023\0221/v"
          + "2/{parent=projects/*/agent/sessions/*}/c"
          + "ontexts\332A\006parent\022\233\001\n\nGetContext\022-.google"
          + ".cloud.dialogflow.v2.GetContextRequest\032#"
          + ".google.cloud.dialogflow.v2.Context\"9\202\323\344"
          + "\223\0023\0221/v2/{name=projects/*/agent/sessions"
          + "/*/contexts/*}\022\252\001\n\rCreateContext\0220.googl"
          + "e.cloud.dialogflow.v2.CreateContextReque"
          + "st\032#.google.cloud.dialogflow.v2.Context\""
          + "B\202\323\344\223\002<\"1/v2/{parent=projects/*/agent/se"
          + "ssions/*}/contexts:\007context\022\262\001\n\rUpdateCo"
          + "ntext\0220.google.cloud.dialogflow.v2.Updat"
          + "eContextRequest\032#.google.cloud.dialogflo"
          + "w.v2.Context\"J\202\323\344\223\002D29/v2/{context.name="
          + "projects/*/agent/sessions/*/contexts/*}:"
          + "\007context\022\224\001\n\rDeleteContext\0220.google.clou"
          + "d.dialogflow.v2.DeleteContextRequest\032\026.g"
          + "oogle.protobuf.Empty\"9\202\323\344\223\0023*1/v2/{name="
          + "projects/*/agent/sessions/*/contexts/*}\022"
          + "\234\001\n\021DeleteAllContexts\0224.google.cloud.dia"
          + "logflow.v2.DeleteAllContextsRequest\032\026.go"
          + "ogle.protobuf.Empty\"9\202\323\344\223\0023*1/v2/{parent"
          + "=projects/*/agent/sessions/*}/contexts\032x"
          + "\312A\031dialogflow.googleapis.com\322AYhttps://w"
          + "ww.googleapis.com/auth/cloud-platform,ht"
          + "tps://www.googleapis.com/auth/dialogflow"
          + "B\233\001\n\036com.google.cloud.dialogflow.v2B\014Con"
          + "textProtoP\001ZDgoogle.golang.org/genproto/"
          + "googleapis/cloud/dialogflow/v2;dialogflo"
          + "w\370\001\001\242\002\002DF\252\002\032Google.Cloud.Dialogflow.V2b\006"
          + "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2_Context_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2_Context_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_Context_descriptor,
            new java.lang.String[] {
              "Name", "LifespanCount", "Parameters",
            });
    internal_static_google_cloud_dialogflow_v2_ListContextsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2_ListContextsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListContextsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2_ListContextsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2_ListContextsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_ListContextsResponse_descriptor,
            new java.lang.String[] {
              "Contexts", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2_GetContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2_GetContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_GetContextRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2_CreateContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_CreateContextRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Context",
            });
    internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_UpdateContextRequest_descriptor,
            new java.lang.String[] {
              "Context", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteContextRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2_DeleteAllContextsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
