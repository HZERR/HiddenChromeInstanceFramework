(function () {
  const events = [
    "mousemove",
    "mousedown",
    "mouseup",
    "click",
    "dblclick",
    "wheel"
  ];

  function drawDot(e, label) {
    const el = document.createElement("div");

    el.style.position = "fixed";
    el.style.left = e.clientX + "px";
    el.style.top = e.clientY + "px";
    el.style.width = label === "mousemove" ? "4px" : "10px";
    el.style.height = label === "mousemove" ? "4px" : "10px";
    el.style.borderRadius = "50%";
    el.style.pointerEvents = "none";
    el.style.zIndex = "2147483647";

    el.style.background =
      e.isTrusted ? "rgba(0,255,0,0.7)" : "rgba(255,0,0,0.7)";

    el.title =
      label +
      " | trusted=" +
      e.isTrusted +
      " | x=" +
      e.clientX +
      " y=" +
      e.clientY;

    document.documentElement.appendChild(el);

    setTimeout(() => el.remove(), 2000);
  }

  events.forEach(type => {
    document.addEventListener(
      type,
      e => drawDot(e, type),
      { passive: true, capture: true }
    );
  });

  console.log("[Mouse Event Visualizer] loaded");
})();
