use jni::{sys::jint, JNIEnv, objects::JObject};


#[no_mangle]
pub extern "system" fn Java_org_example_NativeMath_FastAdd(_env:JNIEnv, _obj: JObject, x:jint, y:jint) -> jint {
    x+y
}
