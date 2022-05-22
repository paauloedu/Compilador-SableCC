/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AAEnquantoAComando extends PAComando
{
    private PAExp _esq_;
    private PAComando _dir_;

    public AAEnquantoAComando()
    {
        // Constructor
    }

    public AAEnquantoAComando(
        @SuppressWarnings("hiding") PAExp _esq_,
        @SuppressWarnings("hiding") PAComando _dir_)
    {
        // Constructor
        setEsq(_esq_);

        setDir(_dir_);

    }

    @Override
    public Object clone()
    {
        return new AAEnquantoAComando(
            cloneNode(this._esq_),
            cloneNode(this._dir_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAEnquantoAComando(this);
    }

    public PAExp getEsq()
    {
        return this._esq_;
    }

    public void setEsq(PAExp node)
    {
        if(this._esq_ != null)
        {
            this._esq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esq_ = node;
    }

    public PAComando getDir()
    {
        return this._dir_;
    }

    public void setDir(PAComando node)
    {
        if(this._dir_ != null)
        {
            this._dir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._dir_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._esq_)
            + toString(this._dir_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._esq_ == child)
        {
            this._esq_ = null;
            return;
        }

        if(this._dir_ == child)
        {
            this._dir_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._esq_ == oldChild)
        {
            setEsq((PAExp) newChild);
            return;
        }

        if(this._dir_ == oldChild)
        {
            setDir((PAComando) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}