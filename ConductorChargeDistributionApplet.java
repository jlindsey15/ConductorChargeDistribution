/*
 * Class : ConductorChargeDistributionApplet.java
 *  Generated using  *  Easy Java Simulations Version 5.0, build 140730. Visit http://www.um.es/fem/Ejs
 */ 

package ConductorChargeDistribution_pkg;

import org.colos.ejs.library._EjsConstants;

// Imports suggested by Model Elements:
// End of imports from Model Elements

public class ConductorChargeDistributionApplet extends org.colos.ejs.library.LauncherApplet {

  static {
    org.opensourcephysics.display.OSPRuntime.loadTranslatorTool = false;
    org.opensourcephysics.display.OSPRuntime.loadVideoTool = false;
    org.opensourcephysics.display.OSPRuntime.loadDataTool = false;
    org.opensourcephysics.display.OSPRuntime.loadExportTool = false;
  }

  public void init () {
    super.init();
    org.opensourcephysics.tools.ResourceLoader.addAppletSearchPath("/");
    org.opensourcephysics.tools.ResourceLoader.addSearchPath(getCodeBase()+""); // This is for relative files
    org.opensourcephysics.tools.ResourceLoader.addSearchPath(""); // This is for relative files, too
    //org.colos.ejs.library.Simulation.setPathToLibrary(getCodeBase()); // This is for classes (such as EjsMatlab) which needs to know where the library is
    if (getParentFrame()!=null) {
      _model = new ConductorChargeDistribution ("Frame",getParentFrame(),getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    else {
      _model = new ConductorChargeDistribution (null,null,getCodeBase(),this,(String[])null,true);
      _simulation = _model._getSimulation();
      _view = _model._getView();
    }
    _simulation.initMoodle();
  }
  public void _reset() { ((ConductorChargeDistribution)_model)._reset(); }
  public void _initialize() { ((ConductorChargeDistribution)_model)._initialize(); }
  public void stop() { _model.getSimulation().onExit(); }
} // End of class ConductorChargeDistributionApplet

