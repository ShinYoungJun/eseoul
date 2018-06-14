
/*********************************************************************************************************
 				*최초작성일 : 2006.05.30
				*최초작성자 : mylee
				*주요처리내용 : Base Bean
				*수정일 :
				*수정자 :
				*수정내용 :
 *********************************************************************************************************/

package main.java.common.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;


public class RoadsBaseBean implements Serializable {
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
