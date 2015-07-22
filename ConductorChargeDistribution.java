/*
 * Class : ConductorChargeDistribution.java
 *  Generated using  *  Easy Java Simulations Version 5.0, build 140730. Visit http://www.um.es/fem/Ejs
 */ 

package ConductorChargeDistribution_pkg;

import org.colos.ejs.library._EjsConstants;

// Imports suggested by Model Elements:
// End of imports from Model Elements

import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class ConductorChargeDistribution extends org.colos.ejs.library.Model {

  static {
    __translatorUtil = new org.colos.ejs.library.utils.TranslatorUtil();
  }

  public ConductorChargeDistributionSimulation _simulation=null;
  public ConductorChargeDistributionView _view=null;
  public ConductorChargeDistribution _model=this;

  // -------------------------- 
  // Information on HTML pages
  // -------------------------- 

  static private java.util.Map<String,java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo>> __htmlPagesMap =
    new java.util.HashMap<String,java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo>>();

  /**
   * Adds info about an html on the model
   */
  static public void _addHtmlPageInfo(String _pageName, String _localeStr, String _title, String _link) {
    java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo> pages = __htmlPagesMap.get(_pageName);
    if (pages==null) {
      pages = new java.util.HashSet<org.colos.ejs.library.utils.HtmlPageInfo>();
      __htmlPagesMap.put(_pageName, pages);
    }
    org.colos.ejs.library.utils.LocaleItem item = org.colos.ejs.library.utils.LocaleItem.getLocaleItem(_localeStr);
    if (item!=null) pages.add(new org.colos.ejs.library.utils.HtmlPageInfo(item, _title, _link));
  }

  /**
   * Returns info about an html on the model
   */
  static public org.colos.ejs.library.utils.HtmlPageInfo _getHtmlPageClassInfo(String _pageName, org.colos.ejs.library.utils.LocaleItem _item) {
    java.util.Set<org.colos.ejs.library.utils.HtmlPageInfo> pages = __htmlPagesMap.get(_pageName);
    if (pages==null) return null;
    org.colos.ejs.library.utils.HtmlPageInfo defaultInfo=null;
    for (org.colos.ejs.library.utils.HtmlPageInfo info : pages) {
      if (info.getLocaleItem().isDefaultItem()) defaultInfo = info;
      if (info.getLocaleItem().equals(_item)) return info;
    }
    return defaultInfo;
  }

  public org.colos.ejs.library.utils.HtmlPageInfo _getHtmlPageInfo(String _pageName, org.colos.ejs.library.utils.LocaleItem _item) { return _getHtmlPageClassInfo(_pageName,_item); }

  // -------------------------- 
  // static methods 
  // -------------------------- 

  static public String _getEjsModel() { return "/ConductorChargeDistribution.ejs"; }

  static public String _getModelDirectory() { return ""; }

  static public java.awt.Dimension _getEjsAppletDimension() {
    return new java.awt.Dimension(1080,526);
  }

  static public java.util.Set<String> _getEjsResources() {
    java.util.Set<String> list = new java.util.HashSet<String>();
    return list;
  };

  static public boolean _common_initialization(String[] _args) {
    String lookAndFeel = null;
    boolean decorated = true;
    if (_args!=null) for (int i=0; i<_args.length; i++) {
      if      (_args[i].equals("-_lookAndFeel"))          lookAndFeel = _args[++i];
      else if (_args[i].equals("-_decorateWindows"))      decorated = true;
      else if (_args[i].equals("-_doNotDecorateWindows")) decorated = false;
    }
    if (lookAndFeel!=null) org.opensourcephysics.display.OSPRuntime.setLookAndFeel(decorated,lookAndFeel);
    org.opensourcephysics.tools.ResourceLoader.addSearchPath("."); // This is for relative resources
    boolean pathsSet = false, underEjs = false;
    try { // in case of security problems
      if ("true".equals(System.getProperty("org.osp.launcher"))) { // Running under Launcher
        org.opensourcephysics.display.OSPRuntime.setLauncherMode(true);
      }
    }
    catch (Exception _exception) { } // do not complain
    try { // in case of security problems
      if (System.getProperty("osp_ejs")!=null) { // Running under EJS
        underEjs = true;
        org.colos.ejs.library.Simulation.setPathToLibrary("/Users/jack/Downloads/EJS_5.0/bin/config/"); // This is for classes (such as EjsMatlab) which needs to know where the library is
        pathsSet = true;
      }
    }
    catch (Exception _exception) { pathsSet = false; } // maybe an unsigned Web start?
    try { org.colos.ejs.library.control.EjsControl.setDefaultScreen(Integer.parseInt(System.getProperty("screen"))); } // set default screen 
    catch (Exception _exception) { } // Ignore any error here
    if (!pathsSet) {
      org.colos.ejs.library.Simulation.setPathToLibrary("/Users/jack/Downloads/EJS_5.0/bin/config/"); // This is for classes (such as EjsMatlab) which needs to know where the library is
    }
    if (!underEjs) {
    }
    return true; // Everything went ok
  }

  static public void main (String[] _args) {
    if (!_common_initialization(_args)) {
      if (org.opensourcephysics.display.OSPRuntime.isLauncherMode()) return;
      System.exit(-1);
    }

    ConductorChargeDistribution __theModel = new ConductorChargeDistribution (_args);
  }

  static public javax.swing.JComponent getModelPane(String[] _args, javax.swing.JFrame _parentFrame) {
    if (!_common_initialization(_args)) return null;
    ConductorChargeDistribution __theModel = new ConductorChargeDistribution ("Frame",_parentFrame,null,null,_args,true);
    return (javax.swing.JComponent) __theModel._getView().getComponent("Frame");
  }

  public ConductorChargeDistribution () { this (null, null, null,null,null,false); } // slave application

  public ConductorChargeDistribution (String[] _args) { this (null, null, null,null,_args,true); }

  public ConductorChargeDistribution (String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, org.colos.ejs.library.LauncherApplet _anApplet, String[] _args, boolean _allowAutoplay) {
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(true);
    __theArguments = _args;
    __theApplet = _anApplet;
    java.text.NumberFormat _Ejs_format = java.text.NumberFormat.getInstance();
    if (_Ejs_format instanceof java.text.DecimalFormat) {
      ((java.text.DecimalFormat) _Ejs_format).getDecimalFormatSymbols().setDecimalSeparator('.');
    }
    _simulation = new ConductorChargeDistributionSimulation (this,_replaceName,_replaceOwnerFrame,_codebase,_allowAutoplay);
    _simulation.processArguments(_args);
    org.colos.ejs.library.control.swing.ControlWindow.setKeepHidden(false);
  }

 // -------------------------------------------
 // Abstract part of Model 
 // -------------------------------------------

  public String _getClassEjsModel() { return _getEjsModel(); }

  public java.util.Set<String> _getClassEjsResources() { return _getEjsResources(); }

  public String _getClassModelDirectory() { return _getModelDirectory(); }

  public org.colos.ejs.library.View _getView() { return _view; }

  public org.colos.ejs.library.Simulation _getSimulation() { return _simulation; }

  public int _getPreferredStepsPerDisplay() { return 1; }

  public void _resetModel () {
    _isEnabled_initialization1 = true; // Reset enabled condition for Model.Initialization.ªì©l­È
    _isEnabled_evolution1 = true; // Reset enabled condition for Model.Evolution.ODE
    _isEnabled_evolution1_Event1 = true; // reset enabled condition for event ¨Æ¥ó 
    _isEnabled_constraints1 = true; // Reset enabled condition for Model.Constraints.FixRel Page
    windowSize = 200; // Variables.jount:1
    a = 3; // Variables.jount:2
    b = 2; // Variables.jount:3
    xmax2 = (windowSize/2) * (windowSize/2) * a * a;; // Variables.jount:4
    ymax2 = (windowSize/2) * (windowSize/2) * b * b; // Variables.jount:5
    t = 0.0; // Variables.jount:6
    dt = 0.01; // Variables.jount:7
    minDistSquared = 9; // Variables.jount:8
    numParticles = 200; // Variables.morejount:1
    xCoords = new double [600]; // Variables.morejount:2
    for (int _i0=0; _i0<600; _i0++) xCoords[_i0] = 0.0; // Variables.morejount:2
    yCoords = new double [600]; // Variables.morejount:3
    for (int _i0=0; _i0<600; _i0++) yCoords[_i0] = 0.0; // Variables.morejount:3
    xVelocities = new double [600]; // Variables.morejount:4
    for (int _i0=0; _i0<600; _i0++) xVelocities[_i0] = 0.0; // Variables.morejount:4
    yVelocities = new double [600]; // Variables.morejount:5
    for (int _i0=0; _i0<600; _i0++) yVelocities[_i0] = 0.0; // Variables.morejount:5
    particleMass = 0.0005; // Variables.morejount:6
    k = 180 *  20.0/((numParticles)*(numParticles-1));; // Variables.morejount:7
    escapingIndex = 0; // Variables.morejount:8
    normalVelocity = 0.0; // Variables.morejount:9
    charges = new double [600]; // Variables.morejount:10
    for (int _i0=0; _i0<600; _i0++) charges[_i0] = 0; // Variables.morejount:10
    fillColors = new java.awt.Color [600]; // Variables.morejount:11
    visible = new boolean [600]; // Variables.morejount:12
    numPosParticles = numParticles / 2; // Variables.morejount:13
    numExternalCharges = 8; // Variables.evenmorejount:1
    externalXCoords = new double [8]; // Variables.evenmorejount:2
    for (int _i0=0; _i0<8; _i0++) externalXCoords[_i0] = windowSize*a*1.2/2 -1; // Variables.evenmorejount:2
    externalYCoords = new double [8]; // Variables.evenmorejount:3
    for (int _i0=0; _i0<8; _i0++) externalYCoords[_i0] = windowSize*b*1.2/2 -1; // Variables.evenmorejount:3
    externalCharges = new int [8]; // Variables.evenmorejount:4
    for (int _i0=0; _i0<8; _i0++) externalCharges[_i0] = 0; // Variables.evenmorejount:4
    externalCharge = 0; // Variables.evenmorejount:5
    chargeColor = java.awt.Color.GRAY; // Variables.evenmorejount:6
    showInterior = true; // Variables.evenmorejount:7
    lattice = new int [(int)(windowSize*a)][(int)(windowSize*b)]; // Variables.evenmorejount:8
    for (int _i0=0; _i0<(int)(windowSize*a); _i0++) 
    for (int _i1=0; _i1<(int)(windowSize*b); _i1++) lattice[_i0][_i1] = 0; // Variables.evenmorejount:8
    colors = new java.awt.Color [numColors]; // Variables.evenmorejount:9
    for (int _i0=0; _i0<numColors; _i0++) colors[_i0] = null; // Variables.evenmorejount:9
    numColors = 29; // Variables.evenmorejount:10
    _ODEi_evolution1 = new _ODE_evolution1();
  }

  public void _initializeSolvers () { for (org.opensourcephysics.numerics.ode_solvers.EjsS_ODE __pode : _privateOdesList.values()) __pode.initializeSolver(); }

  public void _initializeModel () {
    __shouldBreak = false;
    boolean _wasEnabled_initialization1 = _isEnabled_initialization1;
    if (_wasEnabled_initialization1) _initialization1 ();
    if (__shouldBreak) return;
    _initializeSolvers();
  }

  public void _automaticResetSolvers() { 
    _ODEi_evolution1.automaticResetSolver();
  }
  public void _resetSolvers() { 
    _ODEi_evolution1.resetSolver();
  }
  public void _stepModel () {
    __shouldBreak = false;
    boolean _wasEnabled_evolution1 = _isEnabled_evolution1;
    if (_wasEnabled_evolution1) _ODEi_evolution1.step();
    if (__shouldBreak) return;
  }

  public void _updateModel () {
    __shouldBreak = false;
    boolean _wasEnabled_constraints1 = _isEnabled_constraints1;
    if (_wasEnabled_constraints1) _constraints1 ();
    if (__shouldBreak) return;
  }

  public void _freeMemory () {
    getSimulation().setEnded(); // Signal that the simulation ended already
    xCoords = null;  // Variables.morejount:2
    yCoords = null;  // Variables.morejount:3
    xVelocities = null;  // Variables.morejount:4
    yVelocities = null;  // Variables.morejount:5
    charges = null;  // Variables.morejount:10
    fillColors = null;  // Variables.morejount:11
    visible = null;  // Variables.morejount:12
    externalXCoords = null;  // Variables.evenmorejount:2
    externalYCoords = null;  // Variables.evenmorejount:3
    externalCharges = null;  // Variables.evenmorejount:4
    lattice = null;  // Variables.evenmorejount:8
    colors = null;  // Variables.evenmorejount:9
    _ODEi_evolution1=null;
    System.gc(); // Free memory from unused old arrays
  }

 // -------------------------------------------
 // ODEs declaration 
 // -------------------------------------------

  protected java.util.Hashtable<String,org.opensourcephysics.numerics.ode_solvers.EjsS_ODE> _privateOdesList = new java.util.Hashtable<String,org.opensourcephysics.numerics.ode_solvers.EjsS_ODE>();

  public org.opensourcephysics.numerics.ode_solvers.EjsS_ODE _getODE(String _odeName) {
    try { return _privateOdesList.get(_odeName); }
    catch (Exception __exc) { return null; }
  }

  public org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver _getEventSolver(String _odeName) {
    try { return _privateOdesList.get(_odeName).getEventSolver(); }
    catch (Exception __exc) { return null; }
  }

  public void _setSolverClass (String _odeName, Class<?> _solverClass) { // Change the solver in run-time
    try { _privateOdesList.get(_odeName).setSolverClass(_solverClass); }
    catch (Exception __exc) { System.err.println ("There is no ODE with this name "+_odeName); }
  }

  public String _setSolverClass (String _odeName, String _solverClassName) { // Change the solver in run-time
    if (_solverClassName==null) { System.err.println ("Null solver class name!"); return null; }
    try { return _privateOdesList.get(_odeName).setSolverClass(_solverClassName); }
    catch (Exception __exc) { System.err.println ("There is no ODE with this name "+_odeName); return null; }
  }

 // -------------------------------------------
 // Variables defined by the user
 // -------------------------------------------

  public int windowSize  = 200; // Variables.jount:1
  public double a  = 3; // Variables.jount:2
  public double b  = 2; // Variables.jount:3
  public double xmax2  = (windowSize/2) * (windowSize/2) * a * a;; // Variables.jount:4
  public double ymax2  = (windowSize/2) * (windowSize/2) * b * b; // Variables.jount:5
  public double t  = 0.0; // Variables.jount:6
  public double dt  = 0.01; // Variables.jount:7
  public double minDistSquared  = 9; // Variables.jount:8
  public int numParticles  = 200; // Variables.morejount:1
  public double xCoords []; // Variables.morejount:2
  public double yCoords []; // Variables.morejount:3
  public double xVelocities []; // Variables.morejount:4
  public double yVelocities []; // Variables.morejount:5
  public double particleMass  = 0.0005; // Variables.morejount:6
  public double k  = 180 *  20.0/((numParticles)*(numParticles-1));; // Variables.morejount:7
  public int escapingIndex  = 0; // Variables.morejount:8
  public double normalVelocity  = 0.0; // Variables.morejount:9
  public double charges []; // Variables.morejount:10
  public java.awt.Color fillColors []; // Variables.morejount:11
  public boolean visible []; // Variables.morejount:12
  public double numPosParticles  = numParticles / 2; // Variables.morejount:13
  public int numExternalCharges  = 8; // Variables.evenmorejount:1
  public double externalXCoords []; // Variables.evenmorejount:2
  public double externalYCoords []; // Variables.evenmorejount:3
  public int externalCharges []; // Variables.evenmorejount:4
  public int externalCharge  = 0; // Variables.evenmorejount:5
  public java.awt.Color chargeColor  = java.awt.Color.GRAY; // Variables.evenmorejount:6
  public boolean showInterior  = true; // Variables.evenmorejount:7
  public int lattice [][]; // Variables.evenmorejount:8
  public java.awt.Color colors []; // Variables.evenmorejount:9
  public int numColors  = 29; // Variables.evenmorejount:10

 // -------------------------------------------
 // Enabled condition of pages 
 // -------------------------------------------

  private boolean _isEnabled_initialization1 = true; // Enabled condition for Model.Initialization.ªì©l­È
  private boolean _isEnabled_evolution1 = true; // Enabled condition for Model.Evolution.ODE
  private boolean _isEnabled_evolution1_Event1 = true; // Enabled condition for event ¨Æ¥ó 
  private boolean _isEnabled_constraints1 = true; // Enabled condition for Model.Constraints.FixRel Page

  public void _setPageEnabled(String _pageName, boolean _enabled) { // Sets the enabled state of a page
    boolean _pageFound = false;
    if ("ªì©l­È".equals(_pageName)) { _pageFound = true; _isEnabled_initialization1 = _enabled; } // Change enabled condition for Model.Initialization.ªì©l­È
    if ("ODE".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1 = _enabled; _automaticResetSolvers(); } // Change enabled condition for Model.Evolution.ODE
    if ("¨Æ¥ó".equals(_pageName)) { _pageFound = true; _isEnabled_evolution1_Event1 = _enabled; _ODEi_evolution1.initializeSolver(); } // Change enabled condition for event ¨Æ¥ó 
    if ("FixRel Page".equals(_pageName)) { _pageFound = true; _isEnabled_constraints1 = _enabled; } // Change enabled condition for Model.Constraints.FixRel Page
    if (!_pageFound) System.out.println ("_setPageEnabled() warning. Page not found: "+_pageName);
  }

 // -------------------------------------------
 // Methods defined by the user 
 // -------------------------------------------

 // --- Initialization

  public void _initialization1 () { // > Initialization.ªì©l­È
    setMaxes();  // > Initialization.ªì©l­È:1
    for (int i = 0; i < numExternalCharges; i++) {  // > Initialization.ªì©l­È:2
      externalCharges[i] = externalCharge;  // > Initialization.ªì©l­È:3
      externalXCoords[i] = windowSize*a*1.2/2 -1;  // > Initialization.ªì©l­È:4
      externalYCoords[i] = windowSize*b*1.2/2 -60*i;  // > Initialization.ªì©l­È:5
    }  // > Initialization.ªì©l­È:6
    lattice = new int[(int)(windowSize*a)][(int)(windowSize*b)];  // > Initialization.ªì©l­È:7
    for(int i=0;i<numParticles;i++){  // > Initialization.ªì©l­È:8
     xVelocities[i]=yVelocities[i]=0.;  // > Initialization.ªì©l­È:9
     xCoords[i]=a*windowSize*(Math.random()-0.5) * 0.7;  // > Initialization.ªì©l­È:10
     yCoords[i]= b*windowSize*(Math.random()-0.5) * 0.7;  // > Initialization.ªì©l­È:11
     charges[i] = (i <= numPosParticles)? 1 : -1;  // > Initialization.ªì©l­È:12
       if (charges[i] > 0) fillColors[i] = java.awt.Color.BLACK;  // > Initialization.ªì©l­È:13
      else fillColors[i] = java.awt.Color.WHITE;  // > Initialization.ªì©l­È:14
         // > Initialization.ªì©l­È:15
    }  // > Initialization.ªì©l­È:16
    for (int i = 0; i < windowSize * a; i++) {  // > Initialization.ªì©l­È:17
      for (int j = 0; j < windowSize * b; j++) {  // > Initialization.ªì©l­È:18
         try {  // > Initialization.ªì©l­È:19
           lattice[i][j] = 0;  // > Initialization.ªì©l­È:20
         }  // > Initialization.ªì©l­È:21
         catch (Exception e) {}  // > Initialization.ªì©l­È:22
    }  // > Initialization.ªì©l­È:23
    }  // > Initialization.ªì©l­È:24
    for (int i = 0; i < numColors; i++) {  // > Initialization.ªì©l­È:25
      colors[i] = new java.awt.Color(127 + (i - (numColors-1)/2) * (254 / (numColors -1)), 127 + (i - (numColors-1)/2) * (254 / (numColors -1)), 127 + (i - (numColors-1)/2) * (254 / (numColors -1)));  // > Initialization.ªì©l­È:26
    }  // > Initialization.ªì©l­È:27
    //colors[4] = java.awt.Color.lightGray;  // > Initialization.ªì©l­È:28
  }  // > Initialization.ªì©l­È

 // --- Evolution

  private _ODE_evolution1 _ODEi_evolution1;


  // ----------- private class for ODE in page Evolution:ODE

  private class _ODE_evolution1 implements org.opensourcephysics.numerics.ode_solvers.EjsS_ODE, org.opensourcephysics.numerics.ode_solvers.symplectic.VelocityVerletSavvy {
    private org.opensourcephysics.numerics.ode_solvers.SolverEngine __solver=null; // The solver engine
    private org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver __eventSolver=null; // The event solver
    private Class<?> __solverClass=null; // The solver class
    private double[] __state=null; // Our state array
    private boolean __ignoreErrors=false; // Whether to ignore solver errors
    private boolean __mustInitialize=true; // Be sure to initialize the solver
    private boolean __isEnabled=true; // Whether it is enabled
    private boolean __mustUserReinitialize=false; // Whether the user asked to reset the solver
    private boolean __mustReinitialize=true; // flag to reinitialize the solver

    // Temporary array variables matching those defined by the user
    private double[] _xCoords;
    private double[] _yCoords;
    private double[] _xVelocities;
    private double[] _yVelocities;

    _ODE_evolution1() { // Class constructor
      __solverClass = org.opensourcephysics.numerics.ode_solvers.rk.RK4.class;
      __instantiateSolver();
      _privateOdesList.put("ODE",this);
    }

    public org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver getEventSolver() { return __eventSolver; } 

    public void setSolverClass (Class<?> __aSolverClass) { // Change the solver in run-time
      this.__solverClass = __aSolverClass;
      __instantiateSolver();
    }

    public String setSolverClass (String _solverClassName) { // Change the solver in run-time
      String _prefix = "org.opensourcephysics.numerics.ode_solvers.";
      _solverClassName = _solverClassName.trim().toLowerCase();
      if (_solverClassName.indexOf("euler")>=0) {
        if (_solverClassName.indexOf("rich")>=0) _solverClassName = _prefix + "rk.EulerRichardson";
        else _solverClassName = _prefix + "rk.Euler";
      }
      else if (_solverClassName.indexOf("verlet")>=0) _solverClassName = _prefix + "symplectic.VelocityVerlet";
      else if (_solverClassName.indexOf("runge")>=0)  _solverClassName = _prefix + "rk.RK4";
      else if (_solverClassName.indexOf("rk4")>=0)    _solverClassName = _prefix + "rk.RK4";
      else if (_solverClassName.indexOf("boga")>=0)  _solverClassName = _prefix + "rk.BogackiShampine23";
      else if (_solverClassName.indexOf("cash")>=0)  _solverClassName = _prefix + "rk.CashKarp45";
      else if (_solverClassName.indexOf("fehl")>=0) {
        if (_solverClassName.indexOf("7")>=0) _solverClassName = _prefix + "rk.Fehlberg78";
        else _solverClassName = _prefix + "rk.Fehlberg8";
      }
      else if (_solverClassName.indexOf("dorm")>=0 || _solverClassName.indexOf("dopri")>=0) {
        if (_solverClassName.indexOf("8")>=0) _solverClassName = _prefix + "rk.Dopri853";
        else _solverClassName = _prefix + "rk.Dopri5";
      }
      else if (_solverClassName.indexOf("radau")>=0) _solverClassName = _prefix + "rk.Radau5";
      else { System.err.println ("There is no solver with this name "+_solverClassName); return null; }
      try { setSolverClass(Class.forName(_solverClassName)); }
      catch (Exception exc) { exc.printStackTrace(); }
      return _solverClassName;
    }

    private void __instantiateSolver () {
      __state = new double[1+xCoords.length+yCoords.length+xVelocities.length+yVelocities.length];
      // allocate temporary arrays
      _xCoords = new double[xCoords.length];
      _yCoords = new double[yCoords.length];
      _xVelocities = new double[xVelocities.length];
      _yVelocities = new double[yVelocities.length];
      __pushState();
      try { // Create the solver by reflection
        Class<?>[] __c = { };
        Object[] __o = { };
        java.lang.reflect.Constructor<?> __constructor = __solverClass.getDeclaredConstructor(__c);
        __solver = (org.opensourcephysics.numerics.ode_solvers.SolverEngine) __constructor.newInstance(__o);
      } catch (Exception exc) { exc.printStackTrace(); } 
      __eventSolver = new org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver(__solver,this);
      __mustInitialize = true;
    }

    public void setEnabled (boolean __enabled) { __isEnabled = __enabled; }

    public double getIndependentVariableValue () { return __eventSolver.getIndependentVariableValue(); }

    public double getInternalStepSize () { return __eventSolver.getInternalStepSize(); }

    public boolean isAccelerationIndependentOfVelocity() { return false; }

    public void initializeSolver () {
      if (__arraysChanged()) { __instantiateSolver(); initializeSolver(); return; }
      __pushState();
      __eventSolver.initialize(dt);
      __eventSolver.setBestInterpolation(false);
      __eventSolver.setMaximumInternalSteps(10000);
      __eventSolver.removeAllEvents();
      if (_isEnabled_evolution1_Event1) __eventSolver.addEvent( new _ODE_evolution1_Event1());
      __eventSolver.setEstimateFirstStep(false);
      __eventSolver.setEnableExceptions(false);
      __mustReinitialize = true;
      __mustInitialize = false;
    }

    private void __pushState () { // Copy our variables to the state
      // Copy our variables to __state[] 
      int __cIn=0;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<xCoords.length; __i++)
           if (__state[__n++]!=xCoords[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(xCoords,0,__state,__cIn,xCoords.length); __cIn += xCoords.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<yCoords.length; __i++)
           if (__state[__n++]!=yCoords[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(yCoords,0,__state,__cIn,yCoords.length); __cIn += yCoords.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<xVelocities.length; __i++)
           if (__state[__n++]!=xVelocities[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(xVelocities,0,__state,__cIn,xVelocities.length); __cIn += xVelocities.length;
      if (!__mustReinitialize)
        for (int __i=0,__n=__cIn; __i<yVelocities.length; __i++)
           if (__state[__n++]!=yVelocities[__i]) { __mustReinitialize = true; break; }
      System.arraycopy(yVelocities,0,__state,__cIn,yVelocities.length); __cIn += yVelocities.length;
      if (__state[__cIn]!=t) __mustReinitialize = true;
      __state[__cIn++] = t;
    }

    private boolean __arraysChanged () {
      if (xCoords.length != _xCoords.length) return true;
      if (yCoords.length != _yCoords.length) return true;
      if (xVelocities.length != _xVelocities.length) return true;
      if (yVelocities.length != _yVelocities.length) return true;
      return false;
    }

    public void resetSolver () {
      __mustUserReinitialize = true;
    }

    public void automaticResetSolver () {
      __mustReinitialize = true;
    }

    private void __errorAction () {
      if (__ignoreErrors) return;
      System.err.println (__eventSolver.getErrorMessage());
      int __option = javax.swing.JOptionPane.showConfirmDialog(_view.getComponent(_simulation.getMainWindow()),org.colos.ejs.library.Simulation.getEjsString("ODEError.Continue"),
        org.colos.ejs.library.Simulation.getEjsString("Error"), javax.swing.JOptionPane.YES_NO_CANCEL_OPTION);
      if (__option==javax.swing.JOptionPane.YES_OPTION) __ignoreErrors = true;
      else if (__option==javax.swing.JOptionPane.CANCEL_OPTION) _pause();
      // Make sure the solver is reinitialized;
      __mustReinitialize = true;
    }

    public double step() { return __privateStep(false); }

    public double solverStep() { return __privateStep(true); }

    private double __privateStep(boolean __takeMaximumStep) {
      if (!__isEnabled) return 0;
      if (dt==0) return 0;
      if (__mustInitialize) initializeSolver();
      if (__arraysChanged()) { __instantiateSolver(); initializeSolver(); }
      __eventSolver.setStepSize(dt);
      __eventSolver.setInternalStepSize(dt);
      __eventSolver.setMaximumInternalSteps(10000);
      __pushState();
      if (__mustUserReinitialize) { 
        __eventSolver.userReinitialize();
        __mustUserReinitialize = false;
        __mustReinitialize = false;
        if (__eventSolver.getErrorCode()!=org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver.ERROR.NO_ERROR) __errorAction();
      }
      else if (__mustReinitialize) { 
        __eventSolver.reinitialize();
        __mustReinitialize = false;
        if (__eventSolver.getErrorCode()!=org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver.ERROR.NO_ERROR) __errorAction();
      }
      double __stepTaken = __takeMaximumStep ? __eventSolver.maxStep() : __eventSolver.step();
      // Extract our variables from __state
      int __cOut=0;
      System.arraycopy(__state,__cOut,xCoords,0,xCoords.length); __cOut+=xCoords.length;
      System.arraycopy(__state,__cOut,yCoords,0,yCoords.length); __cOut+=yCoords.length;
      System.arraycopy(__state,__cOut,xVelocities,0,xVelocities.length); __cOut+=xVelocities.length;
      System.arraycopy(__state,__cOut,yVelocities,0,yVelocities.length); __cOut+=yVelocities.length;
      t = __state[__cOut++];
      // Check for error
      if (__eventSolver.getErrorCode()!=org.opensourcephysics.numerics.ode_solvers.InterpolatorEventSolver.ERROR.NO_ERROR) __errorAction();
      return __stepTaken;
    }

    public double[] getState () { return __state; }

    public void getRate (double[] __aState, double[] __aRate) {
      __aRate[__aRate.length-1] = 0.0; // In case the prelim code returns
      int __index=-1; // so that it can be used in preliminary code
      // Extract our variables from __aState
      int __cOut=0;
      double[] xCoords = _xCoords;
      System.arraycopy(__aState,__cOut,xCoords,0,xCoords.length); __cOut+=xCoords.length;
      double[] yCoords = _yCoords;
      System.arraycopy(__aState,__cOut,yCoords,0,yCoords.length); __cOut+=yCoords.length;
      double[] xVelocities = _xVelocities;
      System.arraycopy(__aState,__cOut,xVelocities,0,xVelocities.length); __cOut+=xVelocities.length;
      double[] yVelocities = _yVelocities;
      System.arraycopy(__aState,__cOut,yVelocities,0,yVelocities.length); __cOut+=yVelocities.length;
      double t = __aState[__cOut++];
      // Preliminary code: Code to be executed before rate equations are evaluated
      // Compute the rate
      int __cRate = 0;
      for (int i=0; i<xCoords.length; i++) __aRate[__cRate++] = xVelocities[i]; // Evolution:ODE:1
      for (int i=0; i<yCoords.length; i++) __aRate[__cRate++] = yVelocities[i]; // Evolution:ODE:2
      for (int i=0; i<xVelocities.length; i++) __aRate[__cRate++] = calcAccelerationX(i); // Evolution:ODE:3
      for (int i=0; i<yVelocities.length; i++) __aRate[__cRate++] = calcAccelerationY(i); // Evolution:ODE:4
      __aRate[__cRate++] = 1.0; // The independent variable 
    }//end of getRate

    private class _ODE_evolution1_Event1 implements org.opensourcephysics.numerics.ode_solvers.StateEvent {

      public int getTypeOfEvent() { return STATE_EVENT; }

      public int getRootFindingMethod() { return BISECTION; }

      public int getMaxIterations() { return 100; }

      public String toString () { return "¨Æ¥ó"; }

      public double getTolerance () { return 0.00001; }

      public double evaluate (double[] __aState) { 
      // Extract our variables from __aState
      int __cOut=0;
      double[] xCoords = _xCoords;
      System.arraycopy(__aState,__cOut,xCoords,0,xCoords.length); __cOut+=xCoords.length;
      double[] yCoords = _yCoords;
      System.arraycopy(__aState,__cOut,yCoords,0,yCoords.length); __cOut+=yCoords.length;
      double[] xVelocities = _xVelocities;
      System.arraycopy(__aState,__cOut,xVelocities,0,xVelocities.length); __cOut+=xVelocities.length;
      double[] yVelocities = _yVelocities;
      System.arraycopy(__aState,__cOut,yVelocities,0,yVelocities.length); __cOut+=yVelocities.length;
      double t = __aState[__cOut++];
        for(int i=0;i<numParticles;i++){  // > Evolution:ODE:¨Æ¥ó.Zero Condition:1
         double swag =xCoords[i]*xCoords[i]/xmax2+yCoords[i]*yCoords[i]/ymax2;  // > Evolution:ODE:¨Æ¥ó.Zero Condition:2
         double insideness = 0.98-swag;  // > Evolution:ODE:¨Æ¥ó.Zero Condition:3
         if(insideness < 0){  // > Evolution:ODE:¨Æ¥ó.Zero Condition:4
          escapingIndex=i;  // > Evolution:ODE:¨Æ¥ó.Zero Condition:5
          return insideness;  // > Evolution:ODE:¨Æ¥ó.Zero Condition:6
         }   // > Evolution:ODE:¨Æ¥ó.Zero Condition:7
        }  // > Evolution:ODE:¨Æ¥ó.Zero Condition:8
        return 9001;  // > Evolution:ODE:¨Æ¥ó.Zero Condition:9
      }

      public boolean action () { 
      // Extract our variables from __state
      int __cOut=0;
      System.arraycopy(__state,__cOut,xCoords,0,xCoords.length); __cOut+=xCoords.length;
      System.arraycopy(__state,__cOut,yCoords,0,yCoords.length); __cOut+=yCoords.length;
      System.arraycopy(__state,__cOut,xVelocities,0,xVelocities.length); __cOut+=xVelocities.length;
      System.arraycopy(__state,__cOut,yVelocities,0,yVelocities.length); __cOut+=yVelocities.length;
      t = __state[__cOut++];
        boolean _returnValue = userDefinedAction();
      // Copy our variables to __state[] 
      int __cIn=0;
      System.arraycopy(xCoords,0,__state,__cIn,xCoords.length); __cIn += xCoords.length;
      System.arraycopy(yCoords,0,__state,__cIn,yCoords.length); __cIn += yCoords.length;
      System.arraycopy(xVelocities,0,__state,__cIn,xVelocities.length); __cIn += xVelocities.length;
      System.arraycopy(yVelocities,0,__state,__cIn,yVelocities.length); __cIn += yVelocities.length;
      __state[__cIn++] = t;
        return _returnValue;
      }

      private boolean userDefinedAction() {
        keepInsideWalls(escapingIndex);  // > Evolution:ODE:¨Æ¥ó.Action:1
        return true;
      }

    } // End of event class _ODE_evolution1_Event1

  } // End of class _ODE_evolution1

 // --- Constraints

  public void _constraints1 () { // > Fixed relations.FixRel Page
    isVisible();  // > Fixed relations.FixRel Page:1
    chargeColor = new java.awt.Color((int)(127 - externalCharge * 1.27), (int)(127 - externalCharge * 1.27), (int)(127 - externalCharge * 1.27));  // > Fixed relations.FixRel Page:2
    for (int i = 0; i < windowSize * a; i++) {  // > Fixed relations.FixRel Page:3
      for (int j = 0; j < windowSize * b; j++) {  // > Fixed relations.FixRel Page:4
        double charge = 0;  // > Fixed relations.FixRel Page:5
        double myX = i - windowSize*a/2;  // > Fixed relations.FixRel Page:6
        double myY = j - windowSize*b/2;  // > Fixed relations.FixRel Page:7
        double ellipse = myX * myX / ((windowSize*a*windowSize*a/4)) + myY * myY / ((windowSize*b*windowSize*b/4));  // > Fixed relations.FixRel Page:8
        if (ellipse - 1 < -0.2 || ellipse - 1 > 0) charge = 0;  // > Fixed relations.FixRel Page:9
        else {  // > Fixed relations.FixRel Page:10
        for (int k = 0; k < numParticles; k++) {  // > Fixed relations.FixRel Page:11
            double xDif = xCoords[k] - myX;  // > Fixed relations.FixRel Page:12
          double yDif = yCoords[k] - myY;  // > Fixed relations.FixRel Page:13
          double distSquared = xDif * xDif + yDif * yDif;  // > Fixed relations.FixRel Page:14
          if (distSquared < 1000) charge += (double) charges[k];  // > Fixed relations.FixRel Page:15
          }  // > Fixed relations.FixRel Page:16
          }  // > Fixed relations.FixRel Page:17
          charge *= 4.0 * numColors / numParticles;  // > Fixed relations.FixRel Page:18
        if (charge < -(numColors-1)/2) charge = -(numColors-1)/2;  // > Fixed relations.FixRel Page:19
        if (charge > (numColors-1)/2) charge = (numColors-1)/2;  // > Fixed relations.FixRel Page:20
        try {  // > Fixed relations.FixRel Page:21
          lattice[i][j] = (numColors-1)/2 - (int) charge;  // > Fixed relations.FixRel Page:22
        }  // > Fixed relations.FixRel Page:23
        catch (Exception e) {}  // > Fixed relations.FixRel Page:24
          // > Fixed relations.FixRel Page:25
     }  // > Fixed relations.FixRel Page:26
    }  // > Fixed relations.FixRel Page:27
        // > Fixed relations.FixRel Page:28
  }  // > Fixed relations.FixRel Page

 // --- Custom

  public double[] calcForce (int i) {  // > Custom.getF:1
   double xForce,yForce,nf;  // > Custom.getF:2
   xForce = 0;  // > Custom.getF:3
   yForce = 0;  // > Custom.getF:4
   double[] f = new double[2];  // > Custom.getF:5
      // > Custom.getF:6
     // > Custom.getF:7
     for(int j=0;j<numParticles;j++){  // > Custom.getF:8
        if(j!=i){  // > Custom.getF:9
          double distX = xCoords[i]-xCoords[j];  // > Custom.getF:10
          double distY = yCoords[i]-yCoords[j];  // > Custom.getF:11
          double rSquared = distX*distX + distY*distY;  // > Custom.getF:12
          if(rSquared < minDistSquared )rSquared= minDistSquared;  // > Custom.getF:13
            // > Custom.getF:14
          xForce+= k * charges[i] * charges[j] *(distX) /Math.sqrt(rSquared) /(Math.sqrt(rSquared));  // > Custom.getF:15
          yForce+= k * charges[i] * charges[j] * (distY) /Math.sqrt(rSquared) /(Math.sqrt(rSquared));  // > Custom.getF:16
        }  // > Custom.getF:17
     }  // > Custom.getF:18
     // > Custom.getF:19
     for (int j = 0; j<numExternalCharges; j++) {  // > Custom.getF:20
         double distX = xCoords[i]-externalXCoords[j];  // > Custom.getF:21
          double distY = yCoords[i]-externalYCoords[j];  // > Custom.getF:22
          double rSquared = distX*distX + distY*distY;  // > Custom.getF:23
          if(rSquared < minDistSquared )rSquared= minDistSquared;  // > Custom.getF:24
            // > Custom.getF:25
          xForce+= k * charges[i] * externalCharges[j] *(distX) /Math.sqrt(rSquared) /(Math.sqrt(rSquared));  // > Custom.getF:26
          yForce+= k * charges[i] * externalCharges[j] *(distY) /Math.sqrt(rSquared) /(Math.sqrt(rSquared));  // > Custom.getF:27
         // > Custom.getF:28
     }  // > Custom.getF:29
     double swag =xCoords[i]*xCoords[i]/xmax2+yCoords[i]*yCoords[i]/ymax2;  // > Custom.getF:30
     double insideness = 0.98 -swag;  // > Custom.getF:31
     if (insideness < 0) {  // > Custom.getF:32
       double tanSlope =-ymax2*xCoords[i]/(xmax2*yCoords[i]);  // > Custom.getF:33
  double outwardAngle = Math.atan(tanSlope);  // > Custom.getF:34
  double inwardAngle = Math.PI + outwardAngle;  // > Custom.getF:35
  double normalXComponent=-Math.sin(inwardAngle);  // > Custom.getF:36
  double normalYComponent=Math.cos(inwardAngle);  // > Custom.getF:37
  if (yCoords[i] < 0) {  // > Custom.getF:38
    normalXComponent *= -1;  // > Custom.getF:39
    normalYComponent *= -1;  // > Custom.getF:40
  }  // > Custom.getF:41
       double normalForce =xForce*normalXComponent+yForce*normalYComponent;  // > Custom.getF:42
        xForce -= .01 * normalForce*normalXComponent;  // > Custom.getF:43
        yForce -= 1.01 * normalForce*normalYComponent;  // > Custom.getF:44
     }  // > Custom.getF:45
     // > Custom.getF:46
     f[0]=xForce;  // > Custom.getF:47
     f[1]=yForce;  // > Custom.getF:48
     // > Custom.getF:49
     // > Custom.getF:50
      // > Custom.getF:51
      // > Custom.getF:52
  return f;  // > Custom.getF:53
  }  // > Custom.getF:54
  public double calcForceX (int i) {  // > Custom.getF:55
      double[] force = calcForce(i);  // > Custom.getF:56
      return force[0];  // > Custom.getF:57
  }  // > Custom.getF:58
  public double calcForceY (int i) {  // > Custom.getF:59
      double[] force = calcForce(i);  // > Custom.getF:60
      return force[1];  // > Custom.getF:61
  }  // > Custom.getF:62

  public double calcAccelerationX (int i) {  // > Custom.getA:1
     // > Custom.getA:2
    return calcForceX(i)/particleMass;  // > Custom.getA:3
  }  // > Custom.getA:4
  public double calcAccelerationY(int i) {  // > Custom.getA:5
    return calcForceY(i)/particleMass;  // > Custom.getA:6
  }  // > Custom.getA:7

  public void keepInsideWalls (int i) {  // > Custom.keepInsideWalls:1
       // > Custom.keepInsideWalls:2
       // > Custom.keepInsideWalls:3
  double tanSlope =-ymax2*xCoords[i]/(xmax2*yCoords[i]);  // > Custom.keepInsideWalls:4
  double outwardAngle = Math.atan(tanSlope);  // > Custom.keepInsideWalls:5
  double inwardAngle = Math.PI + outwardAngle;  // > Custom.keepInsideWalls:6
  double normalXComponent=-Math.sin(inwardAngle);  // > Custom.keepInsideWalls:7
  double normalYComponent=Math.cos(inwardAngle);  // > Custom.keepInsideWalls:8
  if (yCoords[i] < 0) {  // > Custom.keepInsideWalls:9
    normalXComponent *= -1;  // > Custom.keepInsideWalls:10
    normalYComponent *= -1;  // > Custom.keepInsideWalls:11
  }  // > Custom.keepInsideWalls:12
  normalVelocity= dot(xVelocities[i], yVelocities[i], normalXComponent, normalYComponent);  // > Custom.keepInsideWalls:13
  double normalVX = normalVelocity * normalXComponent;  // > Custom.keepInsideWalls:14
  double normalVY = normalVelocity * normalYComponent;  // > Custom.keepInsideWalls:15
  if(normalVelocity<0){  // > Custom.keepInsideWalls:16
   xVelocities[i]-= 1.01 * normalVX;  // > Custom.keepInsideWalls:17
   yVelocities[i]-= 1.01 * normalVY;  // > Custom.keepInsideWalls:18
  }  // > Custom.keepInsideWalls:19
  //swag =xCoords[i]*xCoords[i]/xmax2+yCoords[i]*yCoords[i]/ymax2;  // > Custom.keepInsideWalls:20
  //double ratio = xCoords[i]/yCoords[i];  // > Custom.keepInsideWalls:21
  //yCoords[i] = 0.9999 * Math.sqrt(xmax2*ymax2/(ratio*ratio*ymax2+xmax2));  // > Custom.keepInsideWalls:22
  //xCoords[i] = 0.9999 * ratio*yCoords[i];  // > Custom.keepInsideWalls:23
  double swag =xCoords[i]*xCoords[i]/xmax2+yCoords[i]*yCoords[i]/ymax2;  // > Custom.keepInsideWalls:24
  //System.out.println("swag: " + swag);  // > Custom.keepInsideWalls:25
  xCoords[i] *= 0.98/swag * 0.99;  // > Custom.keepInsideWalls:26
  yCoords[i] *= 0.98/swag * 0.99;  // > Custom.keepInsideWalls:27
  }  // > Custom.keepInsideWalls:28
      // > Custom.keepInsideWalls:29

  public double dot (double vec1X, double vec1Y, double vec2X, double vec2Y) {  // > Custom.dot:1
    return vec1X * vec2X + vec1Y * vec2Y;  // > Custom.dot:2
  }  // > Custom.dot:3

  public void setMaxes () {  // > Custom.setMaxes:1
    xmax2 = (windowSize/2) * (windowSize/2) * a * a;  // > Custom.setMaxes:2
    ymax2 = (windowSize/2) * (windowSize/2) * b * b;  // > Custom.setMaxes:3
  }  // > Custom.setMaxes:4


  public void isVisible () {  // > Custom.isVisible:1
  ;  // > Custom.isVisible:2
  }  // > Custom.isVisible:3

 // --- Methods for view elements

  public void _method_for_slider4_pressaction () {
    _pause();
  }
  public void _method_for_slider4_action () {
    numPosParticles = numParticles/2;
    _initialize();
    _play();
  }
  public void _method_for_pauseButton_actionOn () {
    _play();
  }
  public void _method_for_pauseButton_actionOff () {
    _pause();
  }
  public void _method_for_initialize_action () {
    _initialize();
  }
  public void _method_for_slider2_pressaction () {
    _pause();
  }
  public void _method_for_slider2_action () {
    _initialize();
    _play();
  }
  public void _method_for_slider3_action () {
    for (int i = 0; i < numExternalCharges; i++) {
      externalCharges[i] = externalCharge;
      };
  }
  public double _method_for_DrawingPanel_minimumX () {
    return -windowSize/2*1.5* a;
  }

  public double _method_for_DrawingPanel_maximumX () {
    return windowSize/2*1.5 * a;
  }

  public double _method_for_DrawingPanel_minimumY () {
    return -windowSize/2 * 1.5 * b;
  }

  public double _method_for_DrawingPanel_maximumY () {
    return windowSize/2 * 1.5  *b;
  }

  public double _method_for_byteRaster_minimumX () {
    return -windowSize*a/2;
  }

  public double _method_for_byteRaster_maximumX () {
    return windowSize*a/2;
  }

  public double _method_for_byteRaster_minimumY () {
    return -windowSize*b/2;
  }

  public double _method_for_byteRaster_maximumY () {
    return windowSize*b/2;
  }

  public boolean _method_for_byteRaster_visible () {
    return !showInterior;
  }

  public double _method_for_base_sizex () {
    return windowSize*a;
  }

  public double _method_for_base_sizey () {
    return windowSize*b;
  }

  public double _method_for_ParticleSet_sizex () {
    return (a > b) ? 4 * a : 4 * b;
  }

  public double _method_for_ParticleSet_sizey () {
    return (a > b) ? 4 * a : 4 * b;
  }

  public void _method_for_slider_dragaction () {
    _initialize();
  }
  public void _method_for_slider_action () {
    _initialize();
    _play();
  }
} // End of class ConductorChargeDistributionModel

