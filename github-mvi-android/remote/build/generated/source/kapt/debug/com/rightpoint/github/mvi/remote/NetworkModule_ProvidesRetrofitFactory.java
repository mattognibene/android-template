// Generated by Dagger (https://google.github.io/dagger).
package com.rightpoint.github.mvi.remote;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.HttpUrl;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  private final Provider<HttpUrl> urlProvider;

  private final Provider<HttpLoggingInterceptor.Level> levelProvider;

  public NetworkModule_ProvidesRetrofitFactory(
      Provider<HttpUrl> urlProvider, Provider<HttpLoggingInterceptor.Level> levelProvider) {
    this.urlProvider = urlProvider;
    this.levelProvider = levelProvider;
  }

  @Override
  public Retrofit get() {
    return provideInstance(urlProvider, levelProvider);
  }

  public static Retrofit provideInstance(
      Provider<HttpUrl> urlProvider, Provider<HttpLoggingInterceptor.Level> levelProvider) {
    return proxyProvidesRetrofit(urlProvider.get(), levelProvider.get());
  }

  public static NetworkModule_ProvidesRetrofitFactory create(
      Provider<HttpUrl> urlProvider, Provider<HttpLoggingInterceptor.Level> levelProvider) {
    return new NetworkModule_ProvidesRetrofitFactory(urlProvider, levelProvider);
  }

  public static Retrofit proxyProvidesRetrofit(HttpUrl url, HttpLoggingInterceptor.Level level) {
    return Preconditions.checkNotNull(
        NetworkModule.providesRetrofit(url, level),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
