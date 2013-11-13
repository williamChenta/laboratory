/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package br.gov.demoiselle.portal.evento.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EventoParticipante service. Represents a row in the &quot;demoiselle_EventoParticipante&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link br.gov.demoiselle.portal.evento.model.impl.EventoParticipanteModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link br.gov.demoiselle.portal.evento.model.impl.EventoParticipanteImpl}.
 * </p>
 *
 * @author Clovis Lemes Ferreira Junior
 * @see EventoParticipante
 * @see br.gov.demoiselle.portal.evento.model.impl.EventoParticipanteImpl
 * @see br.gov.demoiselle.portal.evento.model.impl.EventoParticipanteModelImpl
 * @generated
 */
public interface EventoParticipanteModel extends BaseModel<EventoParticipante> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a evento participante model instance should use the {@link EventoParticipante} interface instead.
	 */

	/**
	 * Returns the primary key of this evento participante.
	 *
	 * @return the primary key of this evento participante
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this evento participante.
	 *
	 * @param primaryKey the primary key of this evento participante
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the evento participante ID of this evento participante.
	 *
	 * @return the evento participante ID of this evento participante
	 */
	public long getEventoParticipanteId();

	/**
	 * Sets the evento participante ID of this evento participante.
	 *
	 * @param eventoParticipanteId the evento participante ID of this evento participante
	 */
	public void setEventoParticipanteId(long eventoParticipanteId);

	/**
	 * Returns the company ID of this evento participante.
	 *
	 * @return the company ID of this evento participante
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this evento participante.
	 *
	 * @param companyId the company ID of this evento participante
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this evento participante.
	 *
	 * @return the user ID of this evento participante
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this evento participante.
	 *
	 * @param userId the user ID of this evento participante
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this evento participante.
	 *
	 * @return the user uuid of this evento participante
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this evento participante.
	 *
	 * @param userUuid the user uuid of this evento participante
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this evento participante.
	 *
	 * @return the create date of this evento participante
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this evento participante.
	 *
	 * @param createDate the create date of this evento participante
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this evento participante.
	 *
	 * @return the modified date of this evento participante
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this evento participante.
	 *
	 * @param modifiedDate the modified date of this evento participante
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the evento ID of this evento participante.
	 *
	 * @return the evento ID of this evento participante
	 */
	public long getEventoId();

	/**
	 * Sets the evento ID of this evento participante.
	 *
	 * @param eventoId the evento ID of this evento participante
	 */
	public void setEventoId(long eventoId);

	/**
	 * Returns the nome of this evento participante.
	 *
	 * @return the nome of this evento participante
	 */
	@AutoEscape
	public String getNome();

	/**
	 * Sets the nome of this evento participante.
	 *
	 * @param nome the nome of this evento participante
	 */
	public void setNome(String nome);

	/**
	 * Returns the email of this evento participante.
	 *
	 * @return the email of this evento participante
	 */
	@AutoEscape
	public String getEmail();

	/**
	 * Sets the email of this evento participante.
	 *
	 * @param email the email of this evento participante
	 */
	public void setEmail(String email);

	/**
	 * Returns the instituicao empresa of this evento participante.
	 *
	 * @return the instituicao empresa of this evento participante
	 */
	@AutoEscape
	public String getInstituicaoEmpresa();

	/**
	 * Sets the instituicao empresa of this evento participante.
	 *
	 * @param instituicaoEmpresa the instituicao empresa of this evento participante
	 */
	public void setInstituicaoEmpresa(String instituicaoEmpresa);

	/**
	 * Returns the convite enviado of this evento participante.
	 *
	 * @return the convite enviado of this evento participante
	 */
	public boolean getConviteEnviado();

	/**
	 * Returns <code>true</code> if this evento participante is convite enviado.
	 *
	 * @return <code>true</code> if this evento participante is convite enviado; <code>false</code> otherwise
	 */
	public boolean isConviteEnviado();

	/**
	 * Sets whether this evento participante is convite enviado.
	 *
	 * @param conviteEnviado the convite enviado of this evento participante
	 */
	public void setConviteEnviado(boolean conviteEnviado);

	/**
	 * Returns the certificado impresso of this evento participante.
	 *
	 * @return the certificado impresso of this evento participante
	 */
	public boolean getCertificadoImpresso();

	/**
	 * Returns <code>true</code> if this evento participante is certificado impresso.
	 *
	 * @return <code>true</code> if this evento participante is certificado impresso; <code>false</code> otherwise
	 */
	public boolean isCertificadoImpresso();

	/**
	 * Sets whether this evento participante is certificado impresso.
	 *
	 * @param certificadoImpresso the certificado impresso of this evento participante
	 */
	public void setCertificadoImpresso(boolean certificadoImpresso);

	/**
	 * Returns the inscricao confirmada of this evento participante.
	 *
	 * @return the inscricao confirmada of this evento participante
	 */
	public boolean getInscricaoConfirmada();

	/**
	 * Returns <code>true</code> if this evento participante is inscricao confirmada.
	 *
	 * @return <code>true</code> if this evento participante is inscricao confirmada; <code>false</code> otherwise
	 */
	public boolean isInscricaoConfirmada();

	/**
	 * Sets whether this evento participante is inscricao confirmada.
	 *
	 * @param inscricaoConfirmada the inscricao confirmada of this evento participante
	 */
	public void setInscricaoConfirmada(boolean inscricaoConfirmada);

	/**
	 * Returns the participacao confirmada of this evento participante.
	 *
	 * @return the participacao confirmada of this evento participante
	 */
	public boolean getParticipacaoConfirmada();

	/**
	 * Returns <code>true</code> if this evento participante is participacao confirmada.
	 *
	 * @return <code>true</code> if this evento participante is participacao confirmada; <code>false</code> otherwise
	 */
	public boolean isParticipacaoConfirmada();

	/**
	 * Sets whether this evento participante is participacao confirmada.
	 *
	 * @param participacaoConfirmada the participacao confirmada of this evento participante
	 */
	public void setParticipacaoConfirmada(boolean participacaoConfirmada);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(EventoParticipante eventoParticipante);

	public int hashCode();

	public CacheModel<EventoParticipante> toCacheModel();

	public EventoParticipante toEscapedModel();

	public String toString();

	public String toXmlString();
}