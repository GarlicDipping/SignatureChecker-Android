//
// Created by garli on 2019-04-25.
//
#include <jni.h>

#ifndef TAPASNDKPLUGINS_SIGNATURECHECKER_H
#define TAPASNDKPLUGINS_SIGNATURECHECKER_H

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT jstring JNICALL Java_plugin_tapas_com_signaturechecker_SignatureChecker_getSignature(
        JNIEnv *env,
        jobject /* this */,
        jobject context);
JNIEXPORT jstring JNICALL Java_plugin_tapas_com_signaturechecker_SignatureChecker_getSignatureSalted(
        JNIEnv *env,
        jobject /* this */,
        jobject context,
        jstring saltStr);

#ifdef __cplusplus
}
#endif

jbyteArray cstr2jbyteArray( JNIEnv *env, const char *nativeStr);

#endif //TAPASNDKPLUGINS_SIGNATURECHECKER_H
