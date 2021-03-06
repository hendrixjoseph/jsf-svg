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

package edu.wright.hendrix11.svg.transform;

/**
 * @author Joe Hendrix
 */
public abstract class XyTransform extends Transform
{

    /**
     *
     */
    protected Number x;

    /**
     *
     */
    protected Number y;

    /**
     * @param x
     * @param y
     */
    public XyTransform(Number x, Number y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * @param x
     */
    public XyTransform(Number x)
    {
        this.x = x;
    }

    /**
     *
     */
    protected XyTransform()
    {

    }
}
