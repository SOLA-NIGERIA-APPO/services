/**
 * ******************************************************************************************
 * Copyright (C) 2012 - Food and Agriculture Organization of the United Nations
 * (FAO). All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,this
 * list of conditions and the following disclaimer. 2. Redistributions in binary
 * form must reproduce the above copyright notice,this list of conditions and
 * the following disclaimer in the documentation and/or other materials provided
 * with the distribution. 3. Neither the name of FAO nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT,STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * *********************************************************************************************
 */
package org.sola.services.ejb.administrative.businesslogic;

import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import org.sola.services.common.br.ValidationResult;
import org.sola.services.common.ejbs.AbstractSolaTransactionEJBLocal;
import org.sola.services.ejb.administrative.repository.entities.*;

/**
 * Provides local interface for the {@linkplain AdministrativeEJB}
 */
@Local
public interface AdministrativeEJBLocal extends AbstractSolaTransactionEJBLocal {

    /**
     * see {@linkplain AdministrativeEJB#getChangeStatusTypes(java.lang.String)
     * AdministrativeEJB.getChangeStatusTypes}
     */
    List<ChangeStatusType> getChangeStatusTypes(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getBaUnitTypes(java.lang.String)
     * AdministrativeEJB.getBaUnitTypes}
     */
    List<BaUnitType> getBaUnitTypes(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getLeaseConditions(java.lang.String)
     * AdministrativeEJB.getLeaseConditions}
     */
    List<LeaseCondition> getLeaseConditions(String languageCode);
    
    /**
     * see {@linkplain AdministrativeEJB#getMortgageTypes(java.lang.String)
     * AdministrativeEJB.getMortgageTypes}
     */
    List<MortgageType> getMortgageTypes(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getRRRGroupTypes(java.lang.String)
     * AdministrativeEJB.getRRRGroupTypes}
     */
    List<RrrGroupType> getRRRGroupTypes(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getRRRTypes(java.lang.String)
     * AdministrativeEJB.getRRRTypes}
     */
    List<RrrType> getRRRTypes(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getSourceBaUnitRelationTypes(java.lang.String)
     * AdministrativeEJB.getSourceBaUnitRelationTypes}
     */
    List<SourceBaUnitRelationType> getSourceBaUnitRelationTypes(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getBaUnitById(java.lang.String)
     * AdministrativeEJB.getBaUnitById}
     */
    BaUnit getBaUnitById(String id);

    /**
     * See {@linkplain AdministrativeEJB#getBaUnitByCode(java.lang.String, java.lang.String)
     * AdministrativeEJB.getBaUnitByCode}
     */
    BaUnit getBaUnitByCode(String nameFirstpart, String nameLastpart);
    
    
    /**
     * See {@linkplain AdministrativeEJB#getBaUnitsByString(java.lang.String, java.lang.String)
     * AdministrativeEJB.getBaUnitByCode}
     */
    List<BaUnit> getBaUnitsByString(String searchString);

    
    /**
     * see {@linkplain AdministrativeEJB#createBaUnit(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.BaUnit)
     * AdministrativeEJB.createBAUnit}
     */
    BaUnit createBaUnit(String serviceId, BaUnit baUnit);

    /**
     * See {@linkplain AdministrativeEJB#saveBaUnit(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.BaUnit)
     * AdministrativeEJB.saveBaUnit}
     */
    BaUnit saveBaUnit(String serviceId, BaUnit baUnit);

    /**
     * See {@linkplain AdministrativeEJB#getBaUnitsByTransactionId(java.lang.String)
     * AdministrativeEJB.getBaUnitsByTransactionId}
     */
    List<BaUnit> getBaUnitsByTransactionId(String transactionId);

    /**
     * See {@linkplain AdministrativeEJB#getBaUnitRelTypes(java.lang.String)
     * AdministrativeEJB.getBaUnitRelTypes}
     */
    List<BaUnitRelType> getBaUnitRelTypes(String languageCode);

    /**
     * See {@linkplain AdministrativeEJB#terminateBaUnit(java.lang.String, java.lang.String)
     * AdministrativeEJB.terminateBaUnit}
     */
    BaUnit terminateBaUnit(String baUnitId, String serviceId);

    /**
     * See {@linkplain AdministrativeEJB#cancelBaUnitTermination(java.lang.String)
     * AdministrativeEJB.cancelBaUnitTermination}
     */
    BaUnit cancelBaUnitTermination(String baUnitId);

    /**
     * see {@linkplain AdministrativeEJB#getBaUnitAreas(java.lang.String)
     * AdministrativeEJB.getBaUnitAreas}
     */
    BaUnitArea getBaUnitAreas(String baUnitId);

    /**
     * see {@linkplain AdministrativeEJB#createBaUnitArea(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.BaUnitArea)
     * AdministrativeEJB.createBAUnitArea}
     */
    BaUnitArea createBaUnitArea(String baUnitId, BaUnitArea baUnitArea);

    /**
     * see {@linkplain AdministrativeEJB#getBaUnitWithCadObject(java.lang.String)
     * AdministrativeEJB.getBaUnitWithCadObject}
     */
    BaUnit getBaUnitWithCadObject(String nameFirstPart, String nameLastPart, String colist);

    /**
     * See {@linkplain AdministrativeEJB#SysRegPubDisParcelName(java.lang.String)
     * CadastreEJB.SysRegPubDisParcelName}.
     */
    List<SysRegPubDisParcelName> getSysRegPubDisParcelNameByLocation(String searchString, String languageCode);

    /**
     * See {@linkplain AdministrativeEJB#SysRegPubDisOwnerName(java.lang.String)
     * CadastreEJB.SysRegPubDisOwnerName}.
     */
    List<SysRegPubDisOwnerName> getSysRegPubDisOwnerNameByLocation(String searchString, String languageCode);

    /**
     * See {@linkplain AdministrativeEJB#SysRegPubDisStateLand(java.lang.String)
     * CadastreEJB.SysRegPubDisStateLand}.
     */
    List<SysRegPubDisStateLand> getSysRegPubDisStateLandByLocation(String searchString, String languageCode);

    List<ValidationResult> publicDisplay(String params, String languageCode) ;
    
    List<SysRegManagement> getSysRegManagement(SysRegManagementParams params, String languageCode);
    
    List<SysRegStatus> getSysRegStatus(SysRegManagementParams params, String languageCode);
    
    List<SysRegGender> getSysRegGender(String searchString, String languageCode);
    
    List<SysRegProgress> getSysRegProgress(SysRegManagementParams params, String languageCode);
    
    /**
     * See {@linkplain AdministrativeEJB#SysRegSigningList(java.lang.String)
     * AdministrativeEJB.SysRegSigningList}.
     */
    List<SysRegSigningList> getSysRegSigningList(String searchString, String languageCode);

    
    
    
    
    /**
     * DISPUTE
     *
     */
    
    
    /**
     * See {@linkplain AdministrativeEJB#getDisputeById(java.lang.String)
     * AdministrativeEJB.getDisputeById}.
     */
    Dispute getDisputeById(String id);
   
      /**
     * See {@linkplain AdministrativeEJB#getDisputeByNr(java.lang.String)
     * AdministrativeEJB.getDisputeByNr}.
     */
    Dispute getDisputeByNr(String nr);
    /**
     * See {@linkplain AdministrativeEJB#getDispute(java.lang.String)
     * AdministrativeEJB.getDispute}.
     */
    
    Dispute getDispute(String id);
    
    /**
     * See {@linkplain AdministrativeEJB#getDisputeByUser(java.lang.String)
     * AdministrativeEJB.getDisputeByUser}.
     */
     Dispute getDisputeByUser(String userId);
     
      /**
     * See {@linkplain AdministrativeEJB#getDisputeByService(java.lang.String)
     * AdministrativeEJB.getDisputeByUser}.
     */
     Dispute getDisputeByService(String serviceId);
   
  
    /**
     * see {@linkplain AdministrativeEJB#getDisputeCategory(java.lang.String)
     * AdministrativeEJB.getDisputeCategory}
     */
    List<DisputeCategory> getDisputeCategory(String languageCode);
    
       /**
     * see {@linkplain AdministrativeEJB#getDisputeType(java.lang.String)
     * AdministrativeEJB.getDisputeType}
     */
    List<DisputeType> getDisputeType(String languageCode);
    
         /**
     * see {@linkplain AdministrativeEJB#getDisputeRoleType(java.lang.String)
     * AdministrativeEJB.getDisputeRoleType}
     */
    List<DisputeRoleType> getDisputeRoleType(String languageCode);

    
    /**
     * see {@linkplain AdministrativeEJB#getDisputeStatus(java.lang.String)
     * AdministrativeEJB.getDisputeStatus}
     */
    List<DisputeStatus> getDisputeStatus(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getOtherAuthorities(java.lang.String)
     * AdministrativeEJB.getOtherAuthorities}
     */
    List<OtherAuthorities> getOtherAuthorities(String languageCode);

    /**
     * see {@linkplain AdministrativeEJB#getDisputeCommentsById(java.lang.String)
     * AdministrativeEJB.getDisputeCommentsById}
     */
    DisputeComments getDisputeCommentsById(String id);
    
    /**
     * see {@linkplain AdministrativeEJB#getDisputeCommentsByDispute(java.lang.String)
     * AdministrativeEJB.getDisputeCommentsByDispute}
     */
    DisputeComments getDisputeCommentsByDispute(String disputeNr);
    
//     /**
//     * see {@linkplain AdministrativeEJB#getDisputePartyByDispute(java.lang.String)
//     * AdministrativeEJB.getDisputePartyByDispute}
//     */
       List<DisputeParty> getDisputePartyByDispute(String disputeNr);
    

    /**
     * see {@linkplain AdministrativeEJB#createDispute(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.Dispute)
     * AdministrativeEJB.createDispute}
     */
    Dispute createDispute(Dispute dispute);

    /**
     * See {@linkplain AdministrativeEJB#saveDispute(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.Dispute)
     * AdministrativeEJB.saveDispute}
     */
    Dispute saveDispute(Dispute dispute);

    /**
     * See {@linkplain AdministrativeEJB#saveDispute(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.Dispute)
     * AdministrativeEJB.saveDispute}
     */
    DisputeComments saveDisputeComments(DisputeComments disputeComments);
    /**
     * see {@linkplain AdministrativeEJB#getDisputePartyById(java.lang.String)
     * AdministrativeEJB.getDisputePartyById}
     */
    DisputeParty getDisputePartyById(String id);
    /**
     * See {@linkplain AdministrativeEJB#saveDisputeParty(java.lang.String,
     * org.sola.services.ejb.administrative.repository.entities.DisputeParty)
     * AdministrativeEJB.saveDisputeParty}
     */
    DisputeParty saveDisputeParty(DisputeParty disputeParty);
    
    
}
