#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include "JNI3.h"

JNIEXPORT jobjectArray JNICALL Java_JNI3_getNum (JNIEnv *env, jobject obj, jint num1, jint num2) {

  jint numRow, numCol, i, j;
  char charAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"[random() % 26];

  numRow = ((jint)num1);
  numCol = ((jint)num2);

  jobjectArray arr[numRow][numCol];


  for (i = 0; i < numRow; i++){
    for (j = 0; j< numCol; j++){
      arr[numRow][numCol] = charAlphabet;
    }
  }

  return arr;
}