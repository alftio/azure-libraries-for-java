/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.graphrbac;

import com.microsoft.azure.v2.management.resources.fluentcore.utils.SdkContext;
import com.microsoft.azure.v2.management.graphrbac.BuiltInRole;
import com.microsoft.azure.v2.management.graphrbac.RoleAssignment;
import com.microsoft.azure.v2.management.graphrbac.ServicePrincipal;
import org.junit.Assert;
import org.junit.Test;

public class RoleAssignmentTests extends GraphRbacManagementTest {
    @Test
    public void canCRUDRoleAssignment() throws Exception {
        String roleAssignmentName = SdkContext.randomUuid();
        String spName = SdkContext.randomResourceName("sp", 20);

        ServicePrincipal sp = graphRbacManager.servicePrincipals().define(spName)
                .withNewApplication("http://" + spName)
                .create();

        SdkContext.sleep(15000);

        RoleAssignment roleAssignment = graphRbacManager.roleAssignments()
                .define(roleAssignmentName)
                .forServicePrincipal(sp)
                .withBuiltInRole(BuiltInRole.CONTRIBUTOR)
                .withSubscriptionScope(resourceManager.subscriptionId())
                .create();

        Assert.assertNotNull(roleAssignment);
    }

}
