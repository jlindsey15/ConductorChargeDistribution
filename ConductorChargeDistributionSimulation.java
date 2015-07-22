/*
 * Class : ConductorChargeDistributionSimulation.java
 *  Generated using  *  Easy Java Simulations Version 5.0, build 140730. Visit http://www.um.es/fem/Ejs
 */ 

package ConductorChargeDistribution_pkg;

import org.colos.ejs.library._EjsConstants;

// Imports suggested by Model Elements:
// End of imports from Model Elements

class ConductorChargeDistributionSimulation extends org.colos.ejs.library.Simulation { 

  private ConductorChargeDistributionView mMainView;

  public ConductorChargeDistributionSimulation (ConductorChargeDistribution _model, String _replaceName, java.awt.Frame _replaceOwnerFrame, java.net.URL _codebase, boolean _allowAutoplay) {
    videoUtil = new org.colos.ejs.library.utils.VideoUtil();
    try { setUnderEjs("true".equals(System.getProperty("osp_ejs"))); }
    catch (Exception exc) { setUnderEjs(false); } // in case of applet security
    setCodebase (_codebase);
    setModel (_model);
    _model._simulation = this;
    mMainView = _model._view = new ConductorChargeDistributionView(this,_replaceName, _replaceOwnerFrame);
    setView (_model._view);
    if (_model._isApplet()) _model._getApplet().captureWindow (_model,"Frame");
    setFPS(25);
    setStepsPerDisplay(_model._getPreferredStepsPerDisplay()); 
    if (_allowAutoplay) { setAutoplay(true); reset(); }
    else { reset(); setAutoplay(true); }
    recreateDescriptionPanel();
    if (_model._getApplet()!=null && _model._getApplet().getParameter("locale")!=null) {
      setLocaleItem(org.colos.ejs.library.utils.LocaleItem.getLocaleItem(_model._getApplet().getParameter("locale")),false);
    }
    else setLocaleItem(getLocaleItem(),false); // false so that not to reset the model twice at start-up
  }

  public java.util.List<String> getWindowsList() {
    java.util.List<String> windowList = new java.util.ArrayList<String>();
    windowList.add("Frame");
    return windowList;
  }

  public String getMainWindow() {
    return "Frame";
  }

  protected void setViewLocale() { // Overwrite its parent's dummy method with real actions 
    mMainView.getConfigurableElement("Frame")
      .setProperty("title","Distribution of Charges in a Conductor")
      .setProperty("size","1080,504");
    mMainView.getConfigurableElement("Panel");
    mMainView.getConfigurableElement("Panel3");
    mMainView.getConfigurableElement("label8")
      .setProperty("text","Fast");
    mMainView.getConfigurableElement("slider4");
    mMainView.getConfigurableElement("label9")
      .setProperty("text","Accurate      ");
    mMainView.getConfigurableElement("pauseButton")
      .setProperty("textOn","Play")
      .setProperty("textOff","Pause");
    mMainView.getConfigurableElement("initialize")
      .setProperty("text","initialize");
    mMainView.getConfigurableElement("twoStateButton")
      .setProperty("textOn","Show Surface Charge Distribution")
      .setProperty("textOff","Show Particles");
    mMainView.getConfigurableElement("slider5");
    mMainView.getConfigurableElement("label10")
      .setProperty("text","# of External Charges");
    mMainView.getConfigurableElement("panel");
    mMainView.getConfigurableElement("label2")
      .setProperty("text"," (+)");
    mMainView.getConfigurableElement("slider2");
    mMainView.getConfigurableElement("label")
      .setProperty("text","Internal Charge");
    mMainView.getConfigurableElement("label3")
      .setProperty("text"," (-)");
    mMainView.getConfigurableElement("panel2");
    mMainView.getConfigurableElement("slider3");
    mMainView.getConfigurableElement("label4")
      .setProperty("text","External Charge");
    mMainView.getConfigurableElement("label6")
      .setProperty("text","(-)");
    mMainView.getConfigurableElement("label7")
      .setProperty("text","(+)");
    mMainView.getConfigurableElement("DrawingPanel")
      .setProperty("size","400,400");
    mMainView.getConfigurableElement("byteRaster");
    mMainView.getConfigurableElement("base");
    mMainView.getConfigurableElement("ParticleSet");
    mMainView.getConfigurableElement("ParticleSet2");
    mMainView.getConfigurableElement("panel3");
    mMainView.getConfigurableElement("slider");
    mMainView.getConfigurableElement("label5")
      .setProperty("text","Object Shape");
    super.setViewLocale();
  }

  public org.colos.ejs.library.LauncherApplet initMoodle () {
    org.colos.ejs.library.LauncherApplet applet = super.initMoodle();
    if (applet!=null && applet.getParameter("moodle_upload_file")!=null &&
        applet.getParameter("ejsapp_id")!=null  && applet.getParameter("user_id")!=null &&
        applet.getParameter("context_id")!=null && applet.getParameter("language")!=null &&
        applet.getParameter("username")!=null)
        moodle = new org.colos.ejs.library.MoodleConnection (applet,this);
    return applet;
  }

} // End of class ConductorChargeDistributionSimulation

