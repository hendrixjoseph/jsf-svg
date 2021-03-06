/*
 *  The MIT License (MIT)
 *
 *  View the full license at:
 *  https://github.com/hendrixjoseph/FamilyTree/blob/master/LICENSE.md
 *
 *  Copyright (c) 2015 Joseph Hendrix
 *
 *  Hosted on GitHub at https://github.com/hendrixjoseph/FamilyTree
 *
 */

package edu.wright.hendrix11.svg.component;

import edu.wright.hendrix11.svg.SuperSvgClass;
import edu.wright.hendrix11.svg.transform.Transform;

/**
 * @author Joe Hendrix
 */
public abstract class SvgComponent extends SuperSvgClass
{

    /**
     * @param name
     */
    protected SvgComponent(String name)
    {
        super(name);
    }

    /**
     * @return
     */
    public Transform getTransform()
    {
        return (Transform) getAttribute("transform");
    }

    /**
     * @param transform
     */
    public void setTransform(Transform transform)
    {
        putAttribute("transform", transform);
    }
}
