
/*********************************************************************************************************
 				*�����ۼ��� : 2006.05.30
				*�����ۼ��� : mylee
				*�ֿ�ó������ : Base Bean
				*������ :
				*������ :
				*�������� :
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