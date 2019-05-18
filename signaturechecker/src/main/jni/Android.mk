LOCAL_PATH := $(call my-dir)

# --------------- signature-checker ---------------

include $(CLEAR_VARS)
LOCAL_MODULE        := signature-checker
LOCAL_SRC_FILES     := SignatureChecker.cpp
LOCAL_CPPFLAGS      += -std=c++14

LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)

