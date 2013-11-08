/*******************************************************************************
 * Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 ******************************************************************************/
package org.cloudifysource.esc.driver.provisioning.openstack;

public class OpenstackServerException extends Exception {

	private static final long serialVersionUID = 1L;

	public OpenstackServerException() {
	}

	public OpenstackServerException(final int statusCode, final String entity) {
		super(String.format("Error requesting Openstack (code=%s): %s", statusCode, entity));
	}

	public OpenstackServerException(final int expectedStatusCode, final int actualStatusCode, final String entity) {
		super(String.format("Error requesting Openstack. Expected code=%s got code=%s cause=%s", expectedStatusCode,
				actualStatusCode, entity));
	}

	public OpenstackServerException(final Throwable cause) {
		super(cause);
	}

	public OpenstackServerException(final int statusCode, final String entity, final Throwable cause) {
		super(String.format("Error requesting Openstack (code=%s): %s", statusCode, entity), cause);
	}
}
