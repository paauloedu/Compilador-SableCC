/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AArBlocoAComando extends PAComando
{
    private PABloco _bloco_;

    public AArBlocoAComando()
    {
        // Constructor
    }

    public AArBlocoAComando(
        @SuppressWarnings("hiding") PABloco _bloco_)
    {
        // Constructor
        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new AArBlocoAComando(
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArBlocoAComando(this);
    }

    public PABloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PABloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._bloco_ == oldChild)
        {
            setBloco((PABloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
