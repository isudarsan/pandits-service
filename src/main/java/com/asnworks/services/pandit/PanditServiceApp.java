package com.asnworks.services.pandit;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class PanditServiceApp implements QuarkusApplication {

  @Override
  public int run(String... args) throws Exception {
    System.out.println("Hello, world !");
    return 0;
  }

  public static void main(String... args) {
    Quarkus.run(PanditServiceApp.class, args);
  }
}