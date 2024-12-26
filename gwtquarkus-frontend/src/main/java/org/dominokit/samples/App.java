package org.dominokit.samples;

import com.google.gwt.core.client.EntryPoint;
import elemental2.dom.DomGlobal;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class App implements EntryPoint {
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

    DomGlobal.console.info("Hello world!");

  }
}
