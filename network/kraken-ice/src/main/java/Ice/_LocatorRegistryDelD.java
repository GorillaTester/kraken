// **********************************************************************
//
// Copyright (c) 2003-2010 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

// Ice version 3.4.1

package Ice;

// <auto-generated>
//
// Generated from file `Locator.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>


public final class _LocatorRegistryDelD extends Ice._ObjectDelD implements _LocatorRegistryDel
{
    public void
    setAdapterDirectProxy(final String id, final Ice.ObjectPrx proxy, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               AdapterAlreadyActiveException,
               AdapterNotFoundException
    {
        throw new Ice.CollocationOptimizationException();
    }

    public void
    setReplicatedAdapterDirectProxy(final String adapterId, final String replicaGroupId, final Ice.ObjectPrx p, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               AdapterAlreadyActiveException,
               AdapterNotFoundException,
               InvalidReplicaGroupIdException
    {
        throw new Ice.CollocationOptimizationException();
    }

    public void
    setServerProcessProxy(final String id, final ProcessPrx proxy, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               ServerNotFoundException
    {
        throw new Ice.CollocationOptimizationException();
    }
}