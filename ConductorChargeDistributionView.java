/*
 * Class : ConductorChargeDistributionView.java
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

class ConductorChargeDistributionView extends org.colos.ejs.library.control.EjsControl implements org.colos.ejs.library.View {
  private ConductorChargeDistributionSimulation _simulation=null;
  private ConductorChargeDistribution _model=null;

  // Public variables for wrapped view elements:
  public java.awt.Component Frame;
  public javax.swing.JPanel Panel;
  public javax.swing.JPanel Panel3;
  public javax.swing.JLabel label8;
  public org.colos.ejs.library.control.swing.JSliderDouble slider4;
  public javax.swing.JLabel label9;
  public javax.swing.JButton pauseButton;
  public javax.swing.JButton initialize;
  public javax.swing.JButton twoStateButton;
  public org.colos.ejs.library.control.swing.JSliderDouble slider5;
  public javax.swing.JLabel label10;
  public javax.swing.JPanel panel;
  public javax.swing.JLabel label2;
  public org.colos.ejs.library.control.swing.JSliderDouble slider2;
  public javax.swing.JLabel label;
  public javax.swing.JLabel label3;
  public javax.swing.JPanel panel2;
  public org.colos.ejs.library.control.swing.JSliderDouble slider3;
  public javax.swing.JLabel label4;
  public javax.swing.JLabel label6;
  public javax.swing.JLabel label7;
  public org.opensourcephysics.drawing2d.DrawingPanel2D DrawingPanel;
  public org.opensourcephysics.display2d.ByteRaster byteRaster;
  public org.opensourcephysics.displayejs.InteractiveParticle base;
  public org.opensourcephysics.displayejs.ElementSet ParticleSet;
  public org.opensourcephysics.displayejs.ElementSet ParticleSet2;
  public javax.swing.JPanel panel3;
  public org.colos.ejs.library.control.swing.JSliderDouble slider;
  public javax.swing.JLabel label5;

  // private variables to block changes in the view variables:
  private boolean __windowSize_canBeChanged__ = true; // Variables.jount:1
  private boolean __a_canBeChanged__ = true; // Variables.jount:2
  private boolean __b_canBeChanged__ = true; // Variables.jount:3
  private boolean __xmax2_canBeChanged__ = true; // Variables.jount:4
  private boolean __ymax2_canBeChanged__ = true; // Variables.jount:5
  private boolean __t_canBeChanged__ = true; // Variables.jount:6
  private boolean __dt_canBeChanged__ = true; // Variables.jount:7
  private boolean __minDistSquared_canBeChanged__ = true; // Variables.jount:8
  private boolean __numParticles_canBeChanged__ = true; // Variables.morejount:1
  private boolean __xCoords_canBeChanged__ = true; // Variables.morejount:2
  private boolean __yCoords_canBeChanged__ = true; // Variables.morejount:3
  private boolean __xVelocities_canBeChanged__ = true; // Variables.morejount:4
  private boolean __yVelocities_canBeChanged__ = true; // Variables.morejount:5
  private boolean __particleMass_canBeChanged__ = true; // Variables.morejount:6
  private boolean __k_canBeChanged__ = true; // Variables.morejount:7
  private boolean __escapingIndex_canBeChanged__ = true; // Variables.morejount:8
  private boolean __normalVelocity_canBeChanged__ = true; // Variables.morejount:9
  private boolean __charges_canBeChanged__ = true; // Variables.morejount:10
  private boolean __fillColors_canBeChanged__ = true; // Variables.morejount:11
  private boolean __visible_canBeChanged__ = true; // Variables.morejount:12
  private boolean __numPosParticles_canBeChanged__ = true; // Variables.morejount:13
  private boolean __numExternalCharges_canBeChanged__ = true; // Variables.evenmorejount:1
  private boolean __externalXCoords_canBeChanged__ = true; // Variables.evenmorejount:2
  private boolean __externalYCoords_canBeChanged__ = true; // Variables.evenmorejount:3
  private boolean __externalCharges_canBeChanged__ = true; // Variables.evenmorejount:4
  private boolean __externalCharge_canBeChanged__ = true; // Variables.evenmorejount:5
  private boolean __chargeColor_canBeChanged__ = true; // Variables.evenmorejount:6
  private boolean __showInterior_canBeChanged__ = true; // Variables.evenmorejount:7
  private boolean __lattice_canBeChanged__ = true; // Variables.evenmorejount:8
  private boolean __colors_canBeChanged__ = true; // Variables.evenmorejount:9
  private boolean __numColors_canBeChanged__ = true; // Variables.evenmorejount:10
  private boolean __externalChargesSelected_canBeChanged__ = true; // Variables.evenmorejount:11
  private boolean __externalChargesFill_canBeChanged__ = true; // Variables.evenmorejount:12
  private boolean __externalChargesBorder_canBeChanged__ = true; // Variables.evenmorejount:13

// ---------- Class constructor -------------------

  public ConductorChargeDistributionView (ConductorChargeDistributionSimulation _sim, String _replaceName, java.awt.Frame _replaceOwnerFrame) {
    super(_sim,_replaceName,_replaceOwnerFrame);
    _simulation = _sim;
    _model = (ConductorChargeDistribution) _sim.getModel();
    _model._view = this;
    addTarget("_simulation",_simulation);
    addTarget("_model",_model);
    _model._resetModel();
    initialize();
    setUpdateSimulation(false);
    // The following is used by the JNLP file for the simulation to help find resources
    try { setUserCodebase(new java.net.URL(System.getProperty("jnlp.codebase"))); }
    catch (Exception exc) { } // Do nothing and keep quiet if it fails
    update();
    if (javax.swing.SwingUtilities.isEventDispatchThread()) createControl();
    else try {
      javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
        public void run () { 
          createControl();
        }
      });
    } catch (java.lang.reflect.InvocationTargetException it_exc) { it_exc.printStackTrace(); 
    } catch (InterruptedException i_exc) { i_exc.printStackTrace(); };
    addElementsMenuEntries();
    update();
    setUpdateSimulation(true);
    addListener("windowSize"); // Variables.jount:1
    addListener("a"); // Variables.jount:2
    addListener("b"); // Variables.jount:3
    addListener("xmax2"); // Variables.jount:4
    addListener("ymax2"); // Variables.jount:5
    addListener("t"); // Variables.jount:6
    addListener("dt"); // Variables.jount:7
    addListener("minDistSquared"); // Variables.jount:8
    addListener("numParticles"); // Variables.morejount:1
    addListener("xCoords"); // Variables.morejount:2
    addListener("yCoords"); // Variables.morejount:3
    addListener("xVelocities"); // Variables.morejount:4
    addListener("yVelocities"); // Variables.morejount:5
    addListener("particleMass"); // Variables.morejount:6
    addListener("k"); // Variables.morejount:7
    addListener("escapingIndex"); // Variables.morejount:8
    addListener("normalVelocity"); // Variables.morejount:9
    addListener("charges"); // Variables.morejount:10
    addListener("fillColors"); // Variables.morejount:11
    addListener("visible"); // Variables.morejount:12
    addListener("numPosParticles"); // Variables.morejount:13
    addListener("numExternalCharges"); // Variables.evenmorejount:1
    addListener("externalXCoords"); // Variables.evenmorejount:2
    addListener("externalYCoords"); // Variables.evenmorejount:3
    addListener("externalCharges"); // Variables.evenmorejount:4
    addListener("externalCharge"); // Variables.evenmorejount:5
    addListener("chargeColor"); // Variables.evenmorejount:6
    addListener("showInterior"); // Variables.evenmorejount:7
    addListener("lattice"); // Variables.evenmorejount:8
    addListener("colors"); // Variables.evenmorejount:9
    addListener("numColors"); // Variables.evenmorejount:10
    addListener("externalChargesSelected"); // Variables.evenmorejount:11
    addListener("externalChargesFill"); // Variables.evenmorejount:12
    addListener("externalChargesBorder"); // Variables.evenmorejount:13
  }

// ---------- Implementation of View -------------------

  public void read() {
    // Ejs requires no read(). Actually, having it might cause problems!
  }

  @SuppressWarnings("unchecked")
  public void read(String _variable) {
    if ("windowSize".equals(_variable)) {
      _model.windowSize = getInt("windowSize"); // Variables.jount:1
      __windowSize_canBeChanged__ = true;
    }
    if ("a".equals(_variable)) {
      _model.a = getDouble("a"); // Variables.jount:2
      __a_canBeChanged__ = true;
    }
    if ("b".equals(_variable)) {
      _model.b = getDouble("b"); // Variables.jount:3
      __b_canBeChanged__ = true;
    }
    if ("xmax2".equals(_variable)) {
      _model.xmax2 = getDouble("xmax2"); // Variables.jount:4
      __xmax2_canBeChanged__ = true;
    }
    if ("ymax2".equals(_variable)) {
      _model.ymax2 = getDouble("ymax2"); // Variables.jount:5
      __ymax2_canBeChanged__ = true;
    }
    if ("t".equals(_variable)) {
      _model.t = getDouble("t"); // Variables.jount:6
      __t_canBeChanged__ = true;
    }
    if ("dt".equals(_variable)) {
      _model.dt = getDouble("dt"); // Variables.jount:7
      __dt_canBeChanged__ = true;
    }
    if ("minDistSquared".equals(_variable)) {
      _model.minDistSquared = getDouble("minDistSquared"); // Variables.jount:8
      __minDistSquared_canBeChanged__ = true;
    }
    if ("numParticles".equals(_variable)) {
      _model.numParticles = getInt("numParticles"); // Variables.morejount:1
      __numParticles_canBeChanged__ = true;
    }
    if ("xCoords".equals(_variable)) {
      double[] _data = (double[]) getValue("xCoords").getObject();
      int _n0 = _data.length;
      if (_n0>_model.xCoords.length) _n0 = _model.xCoords.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.xCoords[_i0] = _data[_i0];
      }
      __xCoords_canBeChanged__ = true;
    }
    if ("yCoords".equals(_variable)) {
      double[] _data = (double[]) getValue("yCoords").getObject();
      int _n0 = _data.length;
      if (_n0>_model.yCoords.length) _n0 = _model.yCoords.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.yCoords[_i0] = _data[_i0];
      }
      __yCoords_canBeChanged__ = true;
    }
    if ("xVelocities".equals(_variable)) {
      double[] _data = (double[]) getValue("xVelocities").getObject();
      int _n0 = _data.length;
      if (_n0>_model.xVelocities.length) _n0 = _model.xVelocities.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.xVelocities[_i0] = _data[_i0];
      }
      __xVelocities_canBeChanged__ = true;
    }
    if ("yVelocities".equals(_variable)) {
      double[] _data = (double[]) getValue("yVelocities").getObject();
      int _n0 = _data.length;
      if (_n0>_model.yVelocities.length) _n0 = _model.yVelocities.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.yVelocities[_i0] = _data[_i0];
      }
      __yVelocities_canBeChanged__ = true;
    }
    if ("particleMass".equals(_variable)) {
      _model.particleMass = getDouble("particleMass"); // Variables.morejount:6
      __particleMass_canBeChanged__ = true;
    }
    if ("k".equals(_variable)) {
      _model.k = getDouble("k"); // Variables.morejount:7
      __k_canBeChanged__ = true;
    }
    if ("escapingIndex".equals(_variable)) {
      _model.escapingIndex = getInt("escapingIndex"); // Variables.morejount:8
      __escapingIndex_canBeChanged__ = true;
    }
    if ("normalVelocity".equals(_variable)) {
      _model.normalVelocity = getDouble("normalVelocity"); // Variables.morejount:9
      __normalVelocity_canBeChanged__ = true;
    }
    if ("charges".equals(_variable)) {
      double[] _data = (double[]) getValue("charges").getObject();
      int _n0 = _data.length;
      if (_n0>_model.charges.length) _n0 = _model.charges.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.charges[_i0] = _data[_i0];
      }
      __charges_canBeChanged__ = true;
    }
    if ("fillColors".equals(_variable)) {
      java.awt.Color[] _data = (java.awt.Color[]) getValue("fillColors").getObject();
      int _n0 = _data.length;
      if (_n0>_model.fillColors.length) _n0 = _model.fillColors.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.fillColors[_i0] = _data[_i0];
      }
      __fillColors_canBeChanged__ = true;
    }
    if ("visible".equals(_variable)) {
      boolean[] _data = (boolean[]) getValue("visible").getObject();
      int _n0 = _data.length;
      if (_n0>_model.visible.length) _n0 = _model.visible.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.visible[_i0] = _data[_i0];
      }
      __visible_canBeChanged__ = true;
    }
    if ("numPosParticles".equals(_variable)) {
      _model.numPosParticles = getDouble("numPosParticles"); // Variables.morejount:13
      __numPosParticles_canBeChanged__ = true;
    }
    if ("numExternalCharges".equals(_variable)) {
      _model.numExternalCharges = getInt("numExternalCharges"); // Variables.evenmorejount:1
      __numExternalCharges_canBeChanged__ = true;
    }
    if ("externalXCoords".equals(_variable)) {
      double[] _data = (double[]) getValue("externalXCoords").getObject();
      int _n0 = _data.length;
      if (_n0>_model.externalXCoords.length) _n0 = _model.externalXCoords.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.externalXCoords[_i0] = _data[_i0];
      }
      __externalXCoords_canBeChanged__ = true;
    }
    if ("externalYCoords".equals(_variable)) {
      double[] _data = (double[]) getValue("externalYCoords").getObject();
      int _n0 = _data.length;
      if (_n0>_model.externalYCoords.length) _n0 = _model.externalYCoords.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.externalYCoords[_i0] = _data[_i0];
      }
      __externalYCoords_canBeChanged__ = true;
    }
    if ("externalCharges".equals(_variable)) {
      int[] _data = (int[]) getValue("externalCharges").getObject();
      int _n0 = _data.length;
      if (_n0>_model.externalCharges.length) _n0 = _model.externalCharges.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.externalCharges[_i0] = _data[_i0];
      }
      __externalCharges_canBeChanged__ = true;
    }
    if ("externalCharge".equals(_variable)) {
      _model.externalCharge = getInt("externalCharge"); // Variables.evenmorejount:5
      __externalCharge_canBeChanged__ = true;
    }
    if ("chargeColor".equals(_variable)) {
      _model.chargeColor = (java.awt.Color) getObject("chargeColor"); // Variables.evenmorejount:6
      __chargeColor_canBeChanged__ = true;
    }
    if ("showInterior".equals(_variable)) {
      _model.showInterior = getBoolean("showInterior"); // Variables.evenmorejount:7
      __showInterior_canBeChanged__ = true;
    }
    if ("lattice".equals(_variable)) {
      int[][] _data = (int[][]) getValue("lattice").getObject();
      int _n0 = _data.length;
      if (_n0>_model.lattice.length) _n0 = _model.lattice.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        int _n1 = _data[_i0].length;
        if (_n1>_model.lattice[_i0].length) _n1 = _model.lattice[_i0].length;
        for (int _i1=0; _i1<_n1; _i1++) {
          _model.lattice[_i0][_i1] = _data[_i0][_i1];
        }
      }
      __lattice_canBeChanged__ = true;
    }
    if ("colors".equals(_variable)) {
      java.awt.Color[] _data = (java.awt.Color[]) getValue("colors").getObject();
      int _n0 = _data.length;
      if (_n0>_model.colors.length) _n0 = _model.colors.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.colors[_i0] = _data[_i0];
      }
      __colors_canBeChanged__ = true;
    }
    if ("numColors".equals(_variable)) {
      _model.numColors = getInt("numColors"); // Variables.evenmorejount:10
      __numColors_canBeChanged__ = true;
    }
    if ("externalChargesSelected".equals(_variable)) {
      boolean[] _data = (boolean[]) getValue("externalChargesSelected").getObject();
      int _n0 = _data.length;
      if (_n0>_model.externalChargesSelected.length) _n0 = _model.externalChargesSelected.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.externalChargesSelected[_i0] = _data[_i0];
      }
      __externalChargesSelected_canBeChanged__ = true;
    }
    if ("externalChargesFill".equals(_variable)) {
      java.awt.Color[] _data = (java.awt.Color[]) getValue("externalChargesFill").getObject();
      int _n0 = _data.length;
      if (_n0>_model.externalChargesFill.length) _n0 = _model.externalChargesFill.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.externalChargesFill[_i0] = _data[_i0];
      }
      __externalChargesFill_canBeChanged__ = true;
    }
    if ("externalChargesBorder".equals(_variable)) {
      java.awt.Color[] _data = (java.awt.Color[]) getValue("externalChargesBorder").getObject();
      int _n0 = _data.length;
      if (_n0>_model.externalChargesBorder.length) _n0 = _model.externalChargesBorder.length;
      for (int _i0=0; _i0<_n0; _i0++) {
        _model.externalChargesBorder[_i0] = _data[_i0];
      }
      __externalChargesBorder_canBeChanged__ = true;
    }
  }

  public void propagateValues () {
    setValue ("_isPlaying",_simulation.isPlaying());
    setValue ("_isPaused", _simulation.isPaused());
    if(__windowSize_canBeChanged__) setValue("windowSize",_model.windowSize); // Variables.jount:1
    if(__a_canBeChanged__) setValue("a",_model.a); // Variables.jount:2
    if(__b_canBeChanged__) setValue("b",_model.b); // Variables.jount:3
    if(__xmax2_canBeChanged__) setValue("xmax2",_model.xmax2); // Variables.jount:4
    if(__ymax2_canBeChanged__) setValue("ymax2",_model.ymax2); // Variables.jount:5
    if(__t_canBeChanged__) setValue("t",_model.t); // Variables.jount:6
    if(__dt_canBeChanged__) setValue("dt",_model.dt); // Variables.jount:7
    if(__minDistSquared_canBeChanged__) setValue("minDistSquared",_model.minDistSquared); // Variables.jount:8
    if(__numParticles_canBeChanged__) setValue("numParticles",_model.numParticles); // Variables.morejount:1
    if(__xCoords_canBeChanged__) setValue("xCoords",_model.xCoords); // Variables.morejount:2
    if(__yCoords_canBeChanged__) setValue("yCoords",_model.yCoords); // Variables.morejount:3
    if(__xVelocities_canBeChanged__) setValue("xVelocities",_model.xVelocities); // Variables.morejount:4
    if(__yVelocities_canBeChanged__) setValue("yVelocities",_model.yVelocities); // Variables.morejount:5
    if(__particleMass_canBeChanged__) setValue("particleMass",_model.particleMass); // Variables.morejount:6
    if(__k_canBeChanged__) setValue("k",_model.k); // Variables.morejount:7
    if(__escapingIndex_canBeChanged__) setValue("escapingIndex",_model.escapingIndex); // Variables.morejount:8
    if(__normalVelocity_canBeChanged__) setValue("normalVelocity",_model.normalVelocity); // Variables.morejount:9
    if(__charges_canBeChanged__) setValue("charges",_model.charges); // Variables.morejount:10
    if(__fillColors_canBeChanged__) setValue("fillColors",_model.fillColors); // Variables.morejount:11
    if(__visible_canBeChanged__) setValue("visible",_model.visible); // Variables.morejount:12
    if(__numPosParticles_canBeChanged__) setValue("numPosParticles",_model.numPosParticles); // Variables.morejount:13
    if(__numExternalCharges_canBeChanged__) setValue("numExternalCharges",_model.numExternalCharges); // Variables.evenmorejount:1
    if(__externalXCoords_canBeChanged__) setValue("externalXCoords",_model.externalXCoords); // Variables.evenmorejount:2
    if(__externalYCoords_canBeChanged__) setValue("externalYCoords",_model.externalYCoords); // Variables.evenmorejount:3
    if(__externalCharges_canBeChanged__) setValue("externalCharges",_model.externalCharges); // Variables.evenmorejount:4
    if(__externalCharge_canBeChanged__) setValue("externalCharge",_model.externalCharge); // Variables.evenmorejount:5
    if(__chargeColor_canBeChanged__) setValue("chargeColor",_model.chargeColor); // Variables.evenmorejount:6
    if(__showInterior_canBeChanged__) setValue("showInterior",_model.showInterior); // Variables.evenmorejount:7
    if(__lattice_canBeChanged__) setValue("lattice",_model.lattice); // Variables.evenmorejount:8
    if(__colors_canBeChanged__) setValue("colors",_model.colors); // Variables.evenmorejount:9
    if(__numColors_canBeChanged__) setValue("numColors",_model.numColors); // Variables.evenmorejount:10
    if(__externalChargesSelected_canBeChanged__) setValue("externalChargesSelected",_model.externalChargesSelected); // Variables.evenmorejount:11
    if(__externalChargesFill_canBeChanged__) setValue("externalChargesFill",_model.externalChargesFill); // Variables.evenmorejount:12
    if(__externalChargesBorder_canBeChanged__) setValue("externalChargesBorder",_model.externalChargesBorder); // Variables.evenmorejount:13
  }

  @SuppressWarnings("unchecked")
  public void blockVariable(String _variable) {
    if ("windowSize".equals(_variable)) __windowSize_canBeChanged__ = false; // Variables.jount:1
    if ("a".equals(_variable)) __a_canBeChanged__ = false; // Variables.jount:2
    if ("b".equals(_variable)) __b_canBeChanged__ = false; // Variables.jount:3
    if ("xmax2".equals(_variable)) __xmax2_canBeChanged__ = false; // Variables.jount:4
    if ("ymax2".equals(_variable)) __ymax2_canBeChanged__ = false; // Variables.jount:5
    if ("t".equals(_variable)) __t_canBeChanged__ = false; // Variables.jount:6
    if ("dt".equals(_variable)) __dt_canBeChanged__ = false; // Variables.jount:7
    if ("minDistSquared".equals(_variable)) __minDistSquared_canBeChanged__ = false; // Variables.jount:8
    if ("numParticles".equals(_variable)) __numParticles_canBeChanged__ = false; // Variables.morejount:1
    if ("xCoords".equals(_variable)) __xCoords_canBeChanged__ = false; // Variables.morejount:2
    if ("yCoords".equals(_variable)) __yCoords_canBeChanged__ = false; // Variables.morejount:3
    if ("xVelocities".equals(_variable)) __xVelocities_canBeChanged__ = false; // Variables.morejount:4
    if ("yVelocities".equals(_variable)) __yVelocities_canBeChanged__ = false; // Variables.morejount:5
    if ("particleMass".equals(_variable)) __particleMass_canBeChanged__ = false; // Variables.morejount:6
    if ("k".equals(_variable)) __k_canBeChanged__ = false; // Variables.morejount:7
    if ("escapingIndex".equals(_variable)) __escapingIndex_canBeChanged__ = false; // Variables.morejount:8
    if ("normalVelocity".equals(_variable)) __normalVelocity_canBeChanged__ = false; // Variables.morejount:9
    if ("charges".equals(_variable)) __charges_canBeChanged__ = false; // Variables.morejount:10
    if ("fillColors".equals(_variable)) __fillColors_canBeChanged__ = false; // Variables.morejount:11
    if ("visible".equals(_variable)) __visible_canBeChanged__ = false; // Variables.morejount:12
    if ("numPosParticles".equals(_variable)) __numPosParticles_canBeChanged__ = false; // Variables.morejount:13
    if ("numExternalCharges".equals(_variable)) __numExternalCharges_canBeChanged__ = false; // Variables.evenmorejount:1
    if ("externalXCoords".equals(_variable)) __externalXCoords_canBeChanged__ = false; // Variables.evenmorejount:2
    if ("externalYCoords".equals(_variable)) __externalYCoords_canBeChanged__ = false; // Variables.evenmorejount:3
    if ("externalCharges".equals(_variable)) __externalCharges_canBeChanged__ = false; // Variables.evenmorejount:4
    if ("externalCharge".equals(_variable)) __externalCharge_canBeChanged__ = false; // Variables.evenmorejount:5
    if ("chargeColor".equals(_variable)) __chargeColor_canBeChanged__ = false; // Variables.evenmorejount:6
    if ("showInterior".equals(_variable)) __showInterior_canBeChanged__ = false; // Variables.evenmorejount:7
    if ("lattice".equals(_variable)) __lattice_canBeChanged__ = false; // Variables.evenmorejount:8
    if ("colors".equals(_variable)) __colors_canBeChanged__ = false; // Variables.evenmorejount:9
    if ("numColors".equals(_variable)) __numColors_canBeChanged__ = false; // Variables.evenmorejount:10
    if ("externalChargesSelected".equals(_variable)) __externalChargesSelected_canBeChanged__ = false; // Variables.evenmorejount:11
    if ("externalChargesFill".equals(_variable)) __externalChargesFill_canBeChanged__ = false; // Variables.evenmorejount:12
    if ("externalChargesBorder".equals(_variable)) __externalChargesBorder_canBeChanged__ = false; // Variables.evenmorejount:13
  }

// ---------- Creation of the interface  -------------------

  private void createControl() {
    // This first frame is added due to what I consider a bug in Java (Paco)
    addElement( new org.colos.ejs.library.control.swing.ControlFrame(),"_TOP_SECRET_")
      .setProperty("waitForReset","true")
      .setProperty("visible","false")
      .setProperty("background","green")
      .setProperty("size","100,100");
    Frame = (java.awt.Component)
      addElement(new org.colos.ejs.library.control.swing.ControlFrame(),"Frame")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("exit","true")
      .setProperty("waitForReset","true")
      .setProperty("title","Distribution of Charges in a Conductor")
      .setProperty("layout","border")
      .setProperty("visible","true")
      .setProperty("location","426,215")
      .setProperty("size","1080,504")
      .getObject();
    Panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"Panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","Frame")
      .setProperty("layout","grid:1,0,0,0")
      .getObject();
    Panel3 = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"Panel3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel")
      .setProperty("layout","FLOW:center,0,0")
      .getObject();
    label8 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label8")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("text","Fast")
      .getObject();
    slider4 = (org.colos.ejs.library.control.swing.JSliderDouble)
      addElement(new org.colos.ejs.library.control.swing.ControlSlider(),"slider4")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("variable","numParticles")
      .setProperty("minimum","20")
      .setProperty("maximum","600")
      .setProperty("pressaction","_model._method_for_slider4_pressaction()" )
      .setProperty("action","_model._method_for_slider4_action()" )
      .getObject();
    label9 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label9")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("text","Accurate      ")
      .getObject();
    pauseButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"pauseButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("variable","_isPaused")
      .setProperty("textOn","Play")
      .setProperty("actionOn","_model._method_for_pauseButton_actionOn()" )
      .setProperty("textOff","Pause")
      .setProperty("actionOff","_model._method_for_pauseButton_actionOff()" )
      .getObject();
    initialize = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlButton(),"initialize")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("text","initialize")
      .setProperty("action","_model._method_for_initialize_action()" )
      .getObject();
    twoStateButton = (javax.swing.JButton)
      addElement(new org.colos.ejs.library.control.swing.ControlTwoStateButton(),"twoStateButton")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("variable","showInterior")
      .setProperty("textOn","Show Surface Charge Distribution")
      .setProperty("textOff","Show Particles")
      .getObject();
    slider5 = (org.colos.ejs.library.control.swing.JSliderDouble)
      addElement(new org.colos.ejs.library.control.swing.ControlSlider(),"slider5")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("variable","numExternalCharges")
      .setProperty("minimum","0")
      .setProperty("maximum","8")
      .getObject();
    label10 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label10")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","Panel3")
      .setProperty("text","# of External Charges")
      .getObject();
    panel = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"panel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","Frame")
      .setProperty("layout","border")
      .getObject();
    label2 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","panel")
      .setProperty("text"," (+)")
      .getObject();
    slider2 = (org.colos.ejs.library.control.swing.JSliderDouble)
      addElement(new org.colos.ejs.library.control.swing.ControlSlider(),"slider2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","panel")
      .setProperty("variable","numPosParticles")
      .setProperty("minimum","0")
      .setProperty("maximum","numParticles")
      .setProperty("orientation","VERTICAL")
      .setProperty("pressaction","_model._method_for_slider2_pressaction()" )
      .setProperty("action","_model._method_for_slider2_action()" )
      .getObject();
    label = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","panel")
      .setProperty("text","Internal Charge")
      .getObject();
    label3 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","south")
      .setProperty("parent","panel")
      .setProperty("text"," (-)")
      .setProperty("alignment","LEFT")
      .getObject();
    panel2 = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"panel2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","Frame")
      .setProperty("layout","border")
      .getObject();
    slider3 = (org.colos.ejs.library.control.swing.JSliderDouble)
      addElement(new org.colos.ejs.library.control.swing.ControlSlider(),"slider3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","panel2")
      .setProperty("variable","externalCharge")
      .setProperty("minimum","-100")
      .setProperty("maximum","100")
      .setProperty("orientation","HORIZONTAL")
      .setProperty("action","_model._method_for_slider3_action()" )
      .getObject();
    label4 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label4")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","north")
      .setProperty("parent","panel2")
      .setProperty("text","External Charge")
      .setProperty("alignment","CENTER")
      .getObject();
    label6 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label6")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","panel2")
      .setProperty("text","(-)")
      .getObject();
    label7 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label7")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","east")
      .setProperty("parent","panel2")
      .setProperty("text","(+)")
      .getObject();
    DrawingPanel = (org.opensourcephysics.drawing2d.DrawingPanel2D)
      addElement(new org.colos.ejs.library.control.swing.ControlDrawingPanel(),"DrawingPanel")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","Frame")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("minimumX","%_model._method_for_DrawingPanel_minimumX()%" )
      .setProperty("maximumX","%_model._method_for_DrawingPanel_maximumX()%" )
      .setProperty("minimumY","%_model._method_for_DrawingPanel_minimumY()%" )
      .setProperty("maximumY","%_model._method_for_DrawingPanel_maximumY()%" )
      .setProperty("square","true")
      .setProperty("size","400,400")
      .setProperty("background","GRAY")
      .getObject();
    byteRaster = (org.opensourcephysics.display2d.ByteRaster)
      addElement(new org.colos.ejs.library.control.drawables.ControlByteRaster(),"byteRaster")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","DrawingPanel")
      .setProperty("data","lattice")
      .setProperty("minimumX","%_model._method_for_byteRaster_minimumX()%" )
      .setProperty("maximumX","%_model._method_for_byteRaster_maximumX()%" )
      .setProperty("minimumY","%_model._method_for_byteRaster_minimumY()%" )
      .setProperty("maximumY","%_model._method_for_byteRaster_maximumY()%" )
      .setProperty("visible","%_model._method_for_byteRaster_visible()%" )
      .setProperty("colorpalette","colors")
      .setProperty("allowRescale","true")
      .getObject();
    base = (org.opensourcephysics.displayejs.InteractiveParticle)
      addElement(new org.colos.ejs.library.control.displayejs.ControlParticle(),"base")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","DrawingPanel")
      .setProperty("sizex","%_model._method_for_base_sizex()%" )
      .setProperty("sizey","%_model._method_for_base_sizey()%" )
      .setProperty("visible","true")
      .setProperty("enabled","false")
      .setProperty("secondaryColor","255,0,0,20")
      .setProperty("color","255,0,0,20")
      .setProperty("stroke","0")
      .getObject();
    ParticleSet = (org.opensourcephysics.displayejs.ElementSet)
      addElement(new org.colos.ejs.library.control.displayejs.ControlParticleSet(),"ParticleSet")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","DrawingPanel")
      .setProperty("elementnumber","numParticles")
      .setProperty("x","xCoords")
      .setProperty("y","yCoords")
      .setProperty("sizex","%_model._method_for_ParticleSet_sizex()%" )
      .setProperty("sizey","%_model._method_for_ParticleSet_sizey()%" )
      .setProperty("visible","showInterior")
      .setProperty("enabled","true")
      .setProperty("color","fillColors")
      .getObject();
    ParticleSet2 = (org.opensourcephysics.displayejs.ElementSet)
      addElement(new org.colos.ejs.library.control.displayejs.ControlParticleSet(),"ParticleSet2")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("parent","DrawingPanel")
      .setProperty("elementnumber","numExternalCharges")
      .setProperty("x","externalXCoords")
      .setProperty("y","externalYCoords")
      .setProperty("sizex","25")
      .setProperty("sizey","25")
      .setProperty("visible","true")
      .setProperty("enabled","true")
      .setProperty("pressaction","_model._method_for_ParticleSet2_pressaction()" )
      .setProperty("secondaryColor","externalChargesBorder")
      .setProperty("color","externalChargesFill")
      .getObject();
    panel3 = (javax.swing.JPanel)
      addElement(new org.colos.ejs.library.control.swing.ControlPanel(),"panel3")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","Frame")
      .setProperty("layout","border")
      .getObject();
    slider = (org.colos.ejs.library.control.swing.JSliderDouble)
      addElement(new org.colos.ejs.library.control.swing.ControlSlider(),"slider")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","center")
      .setProperty("parent","panel3")
      .setProperty("variable","a")
      .setProperty("minimum","0.5")
      .setProperty("maximum","8.0")
      .setProperty("orientation","VERTICAL")
      .setProperty("dragaction","_model._method_for_slider_dragaction()" )
      .setProperty("action","_model._method_for_slider_action()" )
      .getObject();
    label5 = (javax.swing.JLabel)
      addElement(new org.colos.ejs.library.control.swing.ControlLabel(),"label5")
      .setProperty("_ejs_SecondAction_","updateAfterModelAction()")
      .setProperty("position","west")
      .setProperty("parent","panel3")
      .setProperty("text","Object Shape")
      .getObject();
  }

// ---------- Resetting the interface  -------------------

  public void reset() {
    getElement("Frame")
      .setProperty("title","Distribution of Charges in a Conductor")
      .setProperty("visible","true");
    getElement("Panel");
    getElement("Panel3");
    getElement("label8")
      .setProperty("text","Fast");
    getElement("slider4")
      .setProperty("minimum","20")
      .setProperty("maximum","600");
    getElement("label9")
      .setProperty("text","Accurate      ");
    getElement("pauseButton")
      .setProperty("textOn","Play")
      .setProperty("textOff","Pause");
    getElement("initialize")
      .setProperty("text","initialize");
    getElement("twoStateButton")
      .setProperty("textOn","Show Surface Charge Distribution")
      .setProperty("textOff","Show Particles");
    getElement("slider5")
      .setProperty("minimum","0")
      .setProperty("maximum","8");
    getElement("label10")
      .setProperty("text","# of External Charges");
    getElement("panel");
    getElement("label2")
      .setProperty("text"," (+)");
    getElement("slider2")
      .setProperty("minimum","0")
      .setProperty("orientation","VERTICAL");
    getElement("label")
      .setProperty("text","Internal Charge");
    getElement("label3")
      .setProperty("text"," (-)")
      .setProperty("alignment","LEFT");
    getElement("panel2");
    getElement("slider3")
      .setProperty("minimum","-100")
      .setProperty("maximum","100")
      .setProperty("orientation","HORIZONTAL");
    getElement("label4")
      .setProperty("text","External Charge")
      .setProperty("alignment","CENTER");
    getElement("label6")
      .setProperty("text","(-)");
    getElement("label7")
      .setProperty("text","(+)");
    getElement("DrawingPanel")
      .setProperty("autoscaleX","false")
      .setProperty("autoscaleY","false")
      .setProperty("square","true")
      .setProperty("size","400,400")
      .setProperty("background","GRAY");
    getElement("byteRaster")
      .setProperty("allowRescale","true");
    getElement("base")
      .setProperty("visible","true")
      .setProperty("enabled","false")
      .setProperty("secondaryColor","255,0,0,20")
      .setProperty("color","255,0,0,20")
      .setProperty("stroke","0");
    getElement("ParticleSet")
      .setProperty("enabled","true");
    getElement("ParticleSet2")
      .setProperty("sizex","25")
      .setProperty("sizey","25")
      .setProperty("visible","true")
      .setProperty("enabled","true");
    getElement("panel3");
    getElement("slider")
      .setProperty("minimum","0.5")
      .setProperty("maximum","8.0")
      .setProperty("orientation","VERTICAL");
    getElement("label5")
      .setProperty("text","Object Shape");
    __windowSize_canBeChanged__ = true; // Variables.jount:1
    __a_canBeChanged__ = true; // Variables.jount:2
    __b_canBeChanged__ = true; // Variables.jount:3
    __xmax2_canBeChanged__ = true; // Variables.jount:4
    __ymax2_canBeChanged__ = true; // Variables.jount:5
    __t_canBeChanged__ = true; // Variables.jount:6
    __dt_canBeChanged__ = true; // Variables.jount:7
    __minDistSquared_canBeChanged__ = true; // Variables.jount:8
    __numParticles_canBeChanged__ = true; // Variables.morejount:1
    __xCoords_canBeChanged__ = true; // Variables.morejount:2
    __yCoords_canBeChanged__ = true; // Variables.morejount:3
    __xVelocities_canBeChanged__ = true; // Variables.morejount:4
    __yVelocities_canBeChanged__ = true; // Variables.morejount:5
    __particleMass_canBeChanged__ = true; // Variables.morejount:6
    __k_canBeChanged__ = true; // Variables.morejount:7
    __escapingIndex_canBeChanged__ = true; // Variables.morejount:8
    __normalVelocity_canBeChanged__ = true; // Variables.morejount:9
    __charges_canBeChanged__ = true; // Variables.morejount:10
    __fillColors_canBeChanged__ = true; // Variables.morejount:11
    __visible_canBeChanged__ = true; // Variables.morejount:12
    __numPosParticles_canBeChanged__ = true; // Variables.morejount:13
    __numExternalCharges_canBeChanged__ = true; // Variables.evenmorejount:1
    __externalXCoords_canBeChanged__ = true; // Variables.evenmorejount:2
    __externalYCoords_canBeChanged__ = true; // Variables.evenmorejount:3
    __externalCharges_canBeChanged__ = true; // Variables.evenmorejount:4
    __externalCharge_canBeChanged__ = true; // Variables.evenmorejount:5
    __chargeColor_canBeChanged__ = true; // Variables.evenmorejount:6
    __showInterior_canBeChanged__ = true; // Variables.evenmorejount:7
    __lattice_canBeChanged__ = true; // Variables.evenmorejount:8
    __colors_canBeChanged__ = true; // Variables.evenmorejount:9
    __numColors_canBeChanged__ = true; // Variables.evenmorejount:10
    __externalChargesSelected_canBeChanged__ = true; // Variables.evenmorejount:11
    __externalChargesFill_canBeChanged__ = true; // Variables.evenmorejount:12
    __externalChargesBorder_canBeChanged__ = true; // Variables.evenmorejount:13
    super.reset();
  }

} // End of class ConductorChargeDistributionView

