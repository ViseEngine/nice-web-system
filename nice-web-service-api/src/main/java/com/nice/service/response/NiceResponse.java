/**
 *
 */
package com.nice.service.response;

import lombok.Data;
import lombok.ToString;

/**
 * Author: liliangxing
 * Time: 2015-02-09.
 */
@Data
@ToString(callSuper = true)
public class NiceResponse<T> extends CommonResponse<T> {

}
