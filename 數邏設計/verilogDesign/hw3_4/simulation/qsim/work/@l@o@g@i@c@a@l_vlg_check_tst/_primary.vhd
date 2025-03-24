library verilog;
use verilog.vl_types.all;
entity LOGICAL_vlg_check_tst is
    port(
        AND_OP          : in     vl_logic;
        NOT_OP          : in     vl_logic;
        OR_OP           : in     vl_logic;
        sampler_rx      : in     vl_logic
    );
end LOGICAL_vlg_check_tst;
