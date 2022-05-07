/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ADirectStatement extends PDirectStatement
{
    private PBasicStatement _basicStatement_;

    public ADirectStatement()
    {
        // Constructor
    }

    public ADirectStatement(
        @SuppressWarnings("hiding") PBasicStatement _basicStatement_)
    {
        // Constructor
        setBasicStatement(_basicStatement_);

    }

    @Override
    public Object clone()
    {
        return new ADirectStatement(
            cloneNode(this._basicStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADirectStatement(this);
    }

    public PBasicStatement getBasicStatement()
    {
        return this._basicStatement_;
    }

    public void setBasicStatement(PBasicStatement node)
    {
        if(this._basicStatement_ != null)
        {
            this._basicStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._basicStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._basicStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._basicStatement_ == child)
        {
            this._basicStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._basicStatement_ == oldChild)
        {
            setBasicStatement((PBasicStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}