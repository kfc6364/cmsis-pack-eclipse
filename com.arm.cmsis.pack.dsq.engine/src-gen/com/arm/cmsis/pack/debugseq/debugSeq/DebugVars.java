/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Debug Vars</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getConfigfile <em>Configfile</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getVersion <em>Version</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getPname <em>Pname</em>}</li>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDebugVars()
 * @model
 * @generated
 */
public interface DebugVars extends EObject
{
  /**
   * Returns the value of the '<em><b>Configfile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configfile</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configfile</em>' attribute.
   * @see #setConfigfile(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDebugVars_Configfile()
   * @model
   * @generated
   */
  String getConfigfile();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getConfigfile <em>Configfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configfile</em>' attribute.
   * @see #getConfigfile()
   * @generated
   */
  void setConfigfile(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDebugVars_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Pname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pname</em>' attribute.
   * @see #setPname(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDebugVars_Pname()
   * @model
   * @generated
   */
  String getPname();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DebugVars#getPname <em>Pname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pname</em>' attribute.
   * @see #getPname()
   * @generated
   */
  void setPname(String value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link com.arm.cmsis.pack.debugseq.debugSeq.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDebugVars_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // DebugVars
