/*
 * This file is part of LibrePlan
 *
 * Copyright (C) 2009-2010 Fundación para o Fomento da Calidade Industrial e
 *                         Desenvolvemento Tecnolóxico de Galicia
 * Copyright (C) 2010-2011 Igalia, S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.libreplan.ws.resources.api;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import org.libreplan.ws.common.api.IntegrationEntityDTO;

/**
 * DTO for <code>CriterionSatisfaction</code> entity.
 *
 * @author Fernando Bellas Permuy <fbellas@udc.es>
 */
public class CriterionSatisfactionDTO extends IntegrationEntityDTO {

    public final static String ENTITY_TYPE = "criterion-satisfaction";

    @XmlAttribute(name="criterion-type-name")
    public String criterionTypeName;

    @XmlAttribute(name="criterion-name")
    public String criterionName;

    @XmlAttribute(name="start-date")
    @XmlSchemaType(name="date")
    public XMLGregorianCalendar startDate;

    @XmlAttribute(name="end-date")
    @XmlSchemaType(name="date")
    public XMLGregorianCalendar endDate;

    public CriterionSatisfactionDTO() {}

    public CriterionSatisfactionDTO(String code,
        String criterionTypeName, String criterionName,
        XMLGregorianCalendar startDate, XMLGregorianCalendar endDate) {

        super(code);
        this.criterionTypeName = criterionTypeName;
        this.criterionName = criterionName;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    /**
     * This constructor automatically generates a unique code. It is intended
     * to facilitate the implementation of test cases that add new instances
     * (such instances will have a unique code).
     */
    public CriterionSatisfactionDTO(
        String criterionTypeName, String criterionName,
        XMLGregorianCalendar startDate, XMLGregorianCalendar endDate) {

        this(generateCode(), criterionTypeName, criterionName, startDate,
            endDate);

    }

    @Override
    public String getEntityType() {
        return ENTITY_TYPE;
    }

}
