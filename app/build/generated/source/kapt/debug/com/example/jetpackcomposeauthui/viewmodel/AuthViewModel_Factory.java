package com.example.jetpackcomposeauthui.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  @Override
  public AuthViewModel get() {
    return newInstance();
  }

  public static AuthViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthViewModel newInstance() {
    return new AuthViewModel();
  }

  private static final class InstanceHolder {
    private static final AuthViewModel_Factory INSTANCE = new AuthViewModel_Factory();
  }
}
