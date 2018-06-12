/*
 * WHMCS API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.clodesk.lib.whmcs_api_restfull_client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * RequestUpdateClientProduct
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-12T13:15:38.447Z")
public class RequestUpdateClientProduct {
  @JsonProperty("serviceid")
  private Integer serviceid = null;

  @JsonProperty("pid")
  private Integer pid = null;

  @JsonProperty("serverid")
  private Integer serverid = null;

  @JsonProperty("nextduedate")
  private String nextduedate = null;

  @JsonProperty("terminationDate")
  private String terminationDate = null;

  @JsonProperty("completedDate")
  private String completedDate = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("firstpaymentamount")
  private Float firstpaymentamount = null;

  @JsonProperty("recurringamount")
  private Float recurringamount = null;

  @JsonProperty("paymentmethod")
  private String paymentmethod = null;

  @JsonProperty("subscriptionid")
  private String subscriptionid = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("notes")
  private String notes = null;

  @JsonProperty("serviceusername")
  private String serviceusername = null;

  @JsonProperty("servicepassword")
  private String servicepassword = null;

  @JsonProperty("overideautosuspend")
  private String overideautosuspend = null;

  @JsonProperty("overidesuspenduntil")
  private String overidesuspenduntil = null;

  @JsonProperty("ns1")
  private String ns1 = null;

  @JsonProperty("ns2")
  private String ns2 = null;

  @JsonProperty("dedicatedip")
  private String dedicatedip = null;

  @JsonProperty("assignedips")
  private String assignedips = null;

  @JsonProperty("diskusage")
  private Integer diskusage = null;

  @JsonProperty("disklimit")
  private Integer disklimit = null;

  @JsonProperty("bwusage")
  private Integer bwusage = null;

  @JsonProperty("bwlimit")
  private Integer bwlimit = null;

  @JsonProperty("suspendreason")
  private String suspendreason = null;

  @JsonProperty("promoid")
  private Integer promoid = null;

  @JsonProperty("unset")
  private List<String> unset = null;

  @JsonProperty("autorecalc")
  private Boolean autorecalc = null;

  @JsonProperty("customfields")
  private String customfields = null;

  @JsonProperty("configoptions")
  private String configoptions = null;

  public RequestUpdateClientProduct serviceid(Integer serviceid) {
    this.serviceid = serviceid;
    return this;
  }

   /**
   * The id of the client service to update
   * @return serviceid
  **/
  @ApiModelProperty(required = true, value = "The id of the client service to update")
  public Integer getServiceid() {
    return serviceid;
  }

  public void setServiceid(Integer serviceid) {
    this.serviceid = serviceid;
  }

  public RequestUpdateClientProduct pid(Integer pid) {
    this.pid = pid;
    return this;
  }

   /**
   * The package id to associate with the service
   * @return pid
  **/
  @ApiModelProperty(value = "The package id to associate with the service")
  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }

  public RequestUpdateClientProduct serverid(Integer serverid) {
    this.serverid = serverid;
    return this;
  }

   /**
   * The server id to associate with the service
   * @return serverid
  **/
  @ApiModelProperty(value = "The server id to associate with the service")
  public Integer getServerid() {
    return serverid;
  }

  public void setServerid(Integer serverid) {
    this.serverid = serverid;
  }

  public RequestUpdateClientProduct nextduedate(String nextduedate) {
    this.nextduedate = nextduedate;
    return this;
  }

   /**
   * The next due date of the service (Y-m-d)
   * @return nextduedate
  **/
  @ApiModelProperty(value = "The next due date of the service (Y-m-d)")
  public String getNextduedate() {
    return nextduedate;
  }

  public void setNextduedate(String nextduedate) {
    this.nextduedate = nextduedate;
  }

  public RequestUpdateClientProduct terminationDate(String terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Update the termination date of the service (Y-m-d)
   * @return terminationDate
  **/
  @ApiModelProperty(value = "Update the termination date of the service (Y-m-d)")
  public String getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(String terminationDate) {
    this.terminationDate = terminationDate;
  }

  public RequestUpdateClientProduct completedDate(String completedDate) {
    this.completedDate = completedDate;
    return this;
  }

   /**
   * Update the completed date of the service (Y-m-d)
   * @return completedDate
  **/
  @ApiModelProperty(value = "Update the completed date of the service (Y-m-d)")
  public String getCompletedDate() {
    return completedDate;
  }

  public void setCompletedDate(String completedDate) {
    this.completedDate = completedDate;
  }

  public RequestUpdateClientProduct domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain name to be changed to
   * @return domain
  **/
  @ApiModelProperty(value = "The domain name to be changed to")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public RequestUpdateClientProduct firstpaymentamount(Float firstpaymentamount) {
    this.firstpaymentamount = firstpaymentamount;
    return this;
  }

   /**
   * The first payment amount on the service
   * @return firstpaymentamount
  **/
  @ApiModelProperty(value = "The first payment amount on the service")
  public Float getFirstpaymentamount() {
    return firstpaymentamount;
  }

  public void setFirstpaymentamount(Float firstpaymentamount) {
    this.firstpaymentamount = firstpaymentamount;
  }

  public RequestUpdateClientProduct recurringamount(Float recurringamount) {
    this.recurringamount = recurringamount;
    return this;
  }

   /**
   * The recurring amount for automatic renewal invoices
   * @return recurringamount
  **/
  @ApiModelProperty(value = "The recurring amount for automatic renewal invoices")
  public Float getRecurringamount() {
    return recurringamount;
  }

  public void setRecurringamount(Float recurringamount) {
    this.recurringamount = recurringamount;
  }

  public RequestUpdateClientProduct paymentmethod(String paymentmethod) {
    this.paymentmethod = paymentmethod;
    return this;
  }

   /**
   * The payment method to associate in system format (eg paypal)
   * @return paymentmethod
  **/
  @ApiModelProperty(value = "The payment method to associate in system format (eg paypal)")
  public String getPaymentmethod() {
    return paymentmethod;
  }

  public void setPaymentmethod(String paymentmethod) {
    this.paymentmethod = paymentmethod;
  }

  public RequestUpdateClientProduct subscriptionid(String subscriptionid) {
    this.subscriptionid = subscriptionid;
    return this;
  }

   /**
   * The subscription ID to associate with the service
   * @return subscriptionid
  **/
  @ApiModelProperty(value = "The subscription ID to associate with the service")
  public String getSubscriptionid() {
    return subscriptionid;
  }

  public void setSubscriptionid(String subscriptionid) {
    this.subscriptionid = subscriptionid;
  }

  public RequestUpdateClientProduct status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status to change the service to
   * @return status
  **/
  @ApiModelProperty(value = "The status to change the service to")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public RequestUpdateClientProduct notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * The admin notes for the service
   * @return notes
  **/
  @ApiModelProperty(value = "The admin notes for the service")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public RequestUpdateClientProduct serviceusername(String serviceusername) {
    this.serviceusername = serviceusername;
    return this;
  }

   /**
   * The service username
   * @return serviceusername
  **/
  @ApiModelProperty(value = "The service username")
  public String getServiceusername() {
    return serviceusername;
  }

  public void setServiceusername(String serviceusername) {
    this.serviceusername = serviceusername;
  }

  public RequestUpdateClientProduct servicepassword(String servicepassword) {
    this.servicepassword = servicepassword;
    return this;
  }

   /**
   * The service password
   * @return servicepassword
  **/
  @ApiModelProperty(value = "The service password")
  public String getServicepassword() {
    return servicepassword;
  }

  public void setServicepassword(String servicepassword) {
    this.servicepassword = servicepassword;
  }

  public RequestUpdateClientProduct overideautosuspend(String overideautosuspend) {
    this.overideautosuspend = overideautosuspend;
    return this;
  }

   /**
   * Should override auto suspend be provided (‘on’ or ‘off’)
   * @return overideautosuspend
  **/
  @ApiModelProperty(value = "Should override auto suspend be provided (‘on’ or ‘off’)")
  public String getOverideautosuspend() {
    return overideautosuspend;
  }

  public void setOverideautosuspend(String overideautosuspend) {
    this.overideautosuspend = overideautosuspend;
  }

  public RequestUpdateClientProduct overidesuspenduntil(String overidesuspenduntil) {
    this.overidesuspenduntil = overidesuspenduntil;
    return this;
  }

   /**
   * Update the Override Suspend date of the service (Y-m-d)
   * @return overidesuspenduntil
  **/
  @ApiModelProperty(value = "Update the Override Suspend date of the service (Y-m-d)")
  public String getOveridesuspenduntil() {
    return overidesuspenduntil;
  }

  public void setOveridesuspenduntil(String overidesuspenduntil) {
    this.overidesuspenduntil = overidesuspenduntil;
  }

  public RequestUpdateClientProduct ns1(String ns1) {
    this.ns1 = ns1;
    return this;
  }

   /**
   * Name server 1 (VPS/Dedicated servers only)
   * @return ns1
  **/
  @ApiModelProperty(value = "Name server 1 (VPS/Dedicated servers only)")
  public String getNs1() {
    return ns1;
  }

  public void setNs1(String ns1) {
    this.ns1 = ns1;
  }

  public RequestUpdateClientProduct ns2(String ns2) {
    this.ns2 = ns2;
    return this;
  }

   /**
   * Name server 2 (VPS/Dedicated servers only)
   * @return ns2
  **/
  @ApiModelProperty(value = "Name server 2 (VPS/Dedicated servers only)")
  public String getNs2() {
    return ns2;
  }

  public void setNs2(String ns2) {
    this.ns2 = ns2;
  }

  public RequestUpdateClientProduct dedicatedip(String dedicatedip) {
    this.dedicatedip = dedicatedip;
    return this;
  }

   /**
   * Dedicated ip of service
   * @return dedicatedip
  **/
  @ApiModelProperty(value = "Dedicated ip of service")
  public String getDedicatedip() {
    return dedicatedip;
  }

  public void setDedicatedip(String dedicatedip) {
    this.dedicatedip = dedicatedip;
  }

  public RequestUpdateClientProduct assignedips(String assignedips) {
    this.assignedips = assignedips;
    return this;
  }

   /**
   * IPs Assigned (VPS/Dedicated servers only)
   * @return assignedips
  **/
  @ApiModelProperty(value = "IPs Assigned (VPS/Dedicated servers only)")
  public String getAssignedips() {
    return assignedips;
  }

  public void setAssignedips(String assignedips) {
    this.assignedips = assignedips;
  }

  public RequestUpdateClientProduct diskusage(Integer diskusage) {
    this.diskusage = diskusage;
    return this;
  }

   /**
   * The disk usage in bytes
   * @return diskusage
  **/
  @ApiModelProperty(value = "The disk usage in bytes")
  public Integer getDiskusage() {
    return diskusage;
  }

  public void setDiskusage(Integer diskusage) {
    this.diskusage = diskusage;
  }

  public RequestUpdateClientProduct disklimit(Integer disklimit) {
    this.disklimit = disklimit;
    return this;
  }

   /**
   * The disk limit in bytes
   * @return disklimit
  **/
  @ApiModelProperty(value = "The disk limit in bytes")
  public Integer getDisklimit() {
    return disklimit;
  }

  public void setDisklimit(Integer disklimit) {
    this.disklimit = disklimit;
  }

  public RequestUpdateClientProduct bwusage(Integer bwusage) {
    this.bwusage = bwusage;
    return this;
  }

   /**
   * The bandwidth usage in bytes
   * @return bwusage
  **/
  @ApiModelProperty(value = "The bandwidth usage in bytes")
  public Integer getBwusage() {
    return bwusage;
  }

  public void setBwusage(Integer bwusage) {
    this.bwusage = bwusage;
  }

  public RequestUpdateClientProduct bwlimit(Integer bwlimit) {
    this.bwlimit = bwlimit;
    return this;
  }

   /**
   * The bandwidth limit in bytes
   * @return bwlimit
  **/
  @ApiModelProperty(value = "The bandwidth limit in bytes")
  public Integer getBwlimit() {
    return bwlimit;
  }

  public void setBwlimit(Integer bwlimit) {
    this.bwlimit = bwlimit;
  }

  public RequestUpdateClientProduct suspendreason(String suspendreason) {
    this.suspendreason = suspendreason;
    return this;
  }

   /**
   * suspendreason
   * @return suspendreason
  **/
  @ApiModelProperty(value = "suspendreason")
  public String getSuspendreason() {
    return suspendreason;
  }

  public void setSuspendreason(String suspendreason) {
    this.suspendreason = suspendreason;
  }

  public RequestUpdateClientProduct promoid(Integer promoid) {
    this.promoid = promoid;
    return this;
  }

   /**
   * The promotion Id to associate
   * @return promoid
  **/
  @ApiModelProperty(value = "The promotion Id to associate")
  public Integer getPromoid() {
    return promoid;
  }

  public void setPromoid(Integer promoid) {
    this.promoid = promoid;
  }

  public RequestUpdateClientProduct unset(List<String> unset) {
    this.unset = unset;
    return this;
  }

  public RequestUpdateClientProduct addUnsetItem(String unsetItem) {
    if (this.unset == null) {
      this.unset = new ArrayList<String>();
    }
    this.unset.add(unsetItem);
    return this;
  }

   /**
   * An array of items to unset. Can be one of: ‘domain’, ‘serviceusername’, ‘servicepassword’, ‘subscriptionid’, ‘ns1’, ‘ns2’, ‘dedicatedip’, ‘assignedips’, ‘notes’, ‘suspendreason’
   * @return unset
  **/
  @ApiModelProperty(value = "An array of items to unset. Can be one of: ‘domain’, ‘serviceusername’, ‘servicepassword’, ‘subscriptionid’, ‘ns1’, ‘ns2’, ‘dedicatedip’, ‘assignedips’, ‘notes’, ‘suspendreason’")
  public List<String> getUnset() {
    return unset;
  }

  public void setUnset(List<String> unset) {
    this.unset = unset;
  }

  public RequestUpdateClientProduct autorecalc(Boolean autorecalc) {
    this.autorecalc = autorecalc;
    return this;
  }

   /**
   * Should the recurring amount of the service be automatically recalculated (this will ignore any passed $recurringamount)
   * @return autorecalc
  **/
  @ApiModelProperty(value = "Should the recurring amount of the service be automatically recalculated (this will ignore any passed $recurringamount)")
  public Boolean isAutorecalc() {
    return autorecalc;
  }

  public void setAutorecalc(Boolean autorecalc) {
    this.autorecalc = autorecalc;
  }

  public RequestUpdateClientProduct customfields(String customfields) {
    this.customfields = customfields;
    return this;
  }

   /**
   * Base64 encoded serialized array of custom field values - base64_encode(serialize(array(“1”&#x3D;&gt;“Yahoo”)));
   * @return customfields
  **/
  @ApiModelProperty(value = "Base64 encoded serialized array of custom field values - base64_encode(serialize(array(“1”=>“Yahoo”)));")
  public String getCustomfields() {
    return customfields;
  }

  public void setCustomfields(String customfields) {
    this.customfields = customfields;
  }

  public RequestUpdateClientProduct configoptions(String configoptions) {
    this.configoptions = configoptions;
    return this;
  }

   /**
   * Base64 encoded serialized array of configurable option field values - base64_encode(serialize(array(configoptionid &#x3D;&gt; dropdownoptionid, XXX &#x3D;&gt; array(‘optionid’ &#x3D;&gt; YYY, ‘qty’ &#x3D;&gt; ZZZ)))) - XXX is the ID of the configurable option - YYY is the optionid found in tblhostingconfigoption.optionid - ZZZ is the quantity you want to use for that option
   * @return configoptions
  **/
  @ApiModelProperty(value = "Base64 encoded serialized array of configurable option field values - base64_encode(serialize(array(configoptionid => dropdownoptionid, XXX => array(‘optionid’ => YYY, ‘qty’ => ZZZ)))) - XXX is the ID of the configurable option - YYY is the optionid found in tblhostingconfigoption.optionid - ZZZ is the quantity you want to use for that option")
  public String getConfigoptions() {
    return configoptions;
  }

  public void setConfigoptions(String configoptions) {
    this.configoptions = configoptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestUpdateClientProduct requestUpdateClientProduct = (RequestUpdateClientProduct) o;
    return Objects.equals(this.serviceid, requestUpdateClientProduct.serviceid) &&
        Objects.equals(this.pid, requestUpdateClientProduct.pid) &&
        Objects.equals(this.serverid, requestUpdateClientProduct.serverid) &&
        Objects.equals(this.nextduedate, requestUpdateClientProduct.nextduedate) &&
        Objects.equals(this.terminationDate, requestUpdateClientProduct.terminationDate) &&
        Objects.equals(this.completedDate, requestUpdateClientProduct.completedDate) &&
        Objects.equals(this.domain, requestUpdateClientProduct.domain) &&
        Objects.equals(this.firstpaymentamount, requestUpdateClientProduct.firstpaymentamount) &&
        Objects.equals(this.recurringamount, requestUpdateClientProduct.recurringamount) &&
        Objects.equals(this.paymentmethod, requestUpdateClientProduct.paymentmethod) &&
        Objects.equals(this.subscriptionid, requestUpdateClientProduct.subscriptionid) &&
        Objects.equals(this.status, requestUpdateClientProduct.status) &&
        Objects.equals(this.notes, requestUpdateClientProduct.notes) &&
        Objects.equals(this.serviceusername, requestUpdateClientProduct.serviceusername) &&
        Objects.equals(this.servicepassword, requestUpdateClientProduct.servicepassword) &&
        Objects.equals(this.overideautosuspend, requestUpdateClientProduct.overideautosuspend) &&
        Objects.equals(this.overidesuspenduntil, requestUpdateClientProduct.overidesuspenduntil) &&
        Objects.equals(this.ns1, requestUpdateClientProduct.ns1) &&
        Objects.equals(this.ns2, requestUpdateClientProduct.ns2) &&
        Objects.equals(this.dedicatedip, requestUpdateClientProduct.dedicatedip) &&
        Objects.equals(this.assignedips, requestUpdateClientProduct.assignedips) &&
        Objects.equals(this.diskusage, requestUpdateClientProduct.diskusage) &&
        Objects.equals(this.disklimit, requestUpdateClientProduct.disklimit) &&
        Objects.equals(this.bwusage, requestUpdateClientProduct.bwusage) &&
        Objects.equals(this.bwlimit, requestUpdateClientProduct.bwlimit) &&
        Objects.equals(this.suspendreason, requestUpdateClientProduct.suspendreason) &&
        Objects.equals(this.promoid, requestUpdateClientProduct.promoid) &&
        Objects.equals(this.unset, requestUpdateClientProduct.unset) &&
        Objects.equals(this.autorecalc, requestUpdateClientProduct.autorecalc) &&
        Objects.equals(this.customfields, requestUpdateClientProduct.customfields) &&
        Objects.equals(this.configoptions, requestUpdateClientProduct.configoptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceid, pid, serverid, nextduedate, terminationDate, completedDate, domain, firstpaymentamount, recurringamount, paymentmethod, subscriptionid, status, notes, serviceusername, servicepassword, overideautosuspend, overidesuspenduntil, ns1, ns2, dedicatedip, assignedips, diskusage, disklimit, bwusage, bwlimit, suspendreason, promoid, unset, autorecalc, customfields, configoptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestUpdateClientProduct {\n");
    
    sb.append("    serviceid: ").append(toIndentedString(serviceid)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    serverid: ").append(toIndentedString(serverid)).append("\n");
    sb.append("    nextduedate: ").append(toIndentedString(nextduedate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    completedDate: ").append(toIndentedString(completedDate)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    firstpaymentamount: ").append(toIndentedString(firstpaymentamount)).append("\n");
    sb.append("    recurringamount: ").append(toIndentedString(recurringamount)).append("\n");
    sb.append("    paymentmethod: ").append(toIndentedString(paymentmethod)).append("\n");
    sb.append("    subscriptionid: ").append(toIndentedString(subscriptionid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    serviceusername: ").append(toIndentedString(serviceusername)).append("\n");
    sb.append("    servicepassword: ").append(toIndentedString(servicepassword)).append("\n");
    sb.append("    overideautosuspend: ").append(toIndentedString(overideautosuspend)).append("\n");
    sb.append("    overidesuspenduntil: ").append(toIndentedString(overidesuspenduntil)).append("\n");
    sb.append("    ns1: ").append(toIndentedString(ns1)).append("\n");
    sb.append("    ns2: ").append(toIndentedString(ns2)).append("\n");
    sb.append("    dedicatedip: ").append(toIndentedString(dedicatedip)).append("\n");
    sb.append("    assignedips: ").append(toIndentedString(assignedips)).append("\n");
    sb.append("    diskusage: ").append(toIndentedString(diskusage)).append("\n");
    sb.append("    disklimit: ").append(toIndentedString(disklimit)).append("\n");
    sb.append("    bwusage: ").append(toIndentedString(bwusage)).append("\n");
    sb.append("    bwlimit: ").append(toIndentedString(bwlimit)).append("\n");
    sb.append("    suspendreason: ").append(toIndentedString(suspendreason)).append("\n");
    sb.append("    promoid: ").append(toIndentedString(promoid)).append("\n");
    sb.append("    unset: ").append(toIndentedString(unset)).append("\n");
    sb.append("    autorecalc: ").append(toIndentedString(autorecalc)).append("\n");
    sb.append("    customfields: ").append(toIndentedString(customfields)).append("\n");
    sb.append("    configoptions: ").append(toIndentedString(configoptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
